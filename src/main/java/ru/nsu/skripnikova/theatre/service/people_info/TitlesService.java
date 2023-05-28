package ru.nsu.skripnikova.theatre.service.people_info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.entity.people_info.Titles;
import ru.nsu.skripnikova.theatre.repository.people_info.TitlesRepository;

@Service
public class TitlesService {

    @Autowired
    private TitlesRepository titlesRepository;

    public void addTitles (Titles titles) {
        titlesRepository.save(titles);
    }

    public void deleteTitles (Integer titlesId) {
        Titles titles = titlesRepository.getTitlesByTitleID(titlesId);
        if (titles == null) {
            //throw not found exception
        }
        titlesRepository.delete(titles);
    }

    public Titles getTitles (Integer titlesId) {
        return titlesRepository.getTitlesByTitleID(titlesId);
    }

    public void updateTitles (Titles titles, Integer titlesId) {
        if (titlesRepository.getTitlesByTitleID(titlesId) == null) {
            //throw not found exception
        }
        titles.setTitleID(titlesId);
        titlesRepository.save(titles);
    }
}
