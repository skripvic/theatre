package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.ShowDatePlayRequest;
import ru.nsu.skripnikova.theatre.controller.requests.ShowDatesRequest;
import ru.nsu.skripnikova.theatre.controller.requests.StagingsPlaysRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.Stagings;
import ru.nsu.skripnikova.theatre.entity.sales.ShowDates;
import ru.nsu.skripnikova.theatre.repository.sales.ShowDatesRepository;
import ru.nsu.skripnikova.theatre.service.repertoire.PlaysService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ShowDatesService {

    @Autowired
    private ShowDatesRepository showDatesRepository;

    @Autowired
    private PlaysService playsService;

    public void addShowDates(ShowDatesRequest showDatesRequest) throws ParseException {
        Integer nextVal = showDatesRepository.getNextShowDatesId();
        Date showDate = formatDateFromString(showDatesRequest.getShowDate());

        ShowDates authors = new ShowDates(nextVal, showDate, showDatesRequest.getStagingId(), showDatesRequest.getPriceFactor());
        showDatesRepository.save(authors);
    }

    public void deleteShowDates(Integer showDatesId) {
        ShowDates showDates = showDatesRepository.getShowDatesByShowDateId(showDatesId);
        if (showDates == null) {
            //throw not found exception
        }
        showDatesRepository.delete(showDates);
    }

    public ShowDates getShowDates(Integer showDatesId) {
        return showDatesRepository.getShowDatesByShowDateId(showDatesId);
    }

    public void updateShowDates(ShowDates showDates, Integer showDatesId) {
        if (showDatesRepository.getShowDatesByShowDateId(showDatesId) == null) {
            //throw not found exception
        }
        showDates.setShowDateId(showDatesId);
        showDatesRepository.save(showDates);
    }

    public List<ShowDatePlayRequest> getShowDatePlayRequest(){
        List<ShowDatePlayRequest> list = new ArrayList<>();
        List<ShowDates> showDates = showDatesRepository.getShowDates();
        for (ShowDates showDate : showDates) {
            ShowDatePlayRequest showDatePlayRequest = new ShowDatePlayRequest();
            showDatePlayRequest.setShowDateId(showDate.getShowDateId());
            showDatePlayRequest.setShowDate(showDate.getShowDate());
            showDatePlayRequest.setName(playsService.getPlayNameByStagingId(showDate.getStagingId()));
            list.add(showDatePlayRequest);
        }
        return list;
    }

    private Date formatDateFromString(String stringDate) throws  ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }
}
