package ru.nsu.skripnikova.theatre.service.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.ShowDatesRequest;
import ru.nsu.skripnikova.theatre.entity.sales.ShowDates;
import ru.nsu.skripnikova.theatre.repository.sales.ShowDatesRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ShowDatesService {

    @Autowired
    private ShowDatesRepository showDatesRepository;

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

    private Date formatDateFromString(String stringDate) throws  ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
        return formatter.parse(stringDate);
    }
}
