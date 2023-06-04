package ru.nsu.skripnikova.theatre.service.repertoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.skripnikova.theatre.controller.requests.AgeCategoriesRequest;
import ru.nsu.skripnikova.theatre.entity.repertoire.AgeCategories;
import ru.nsu.skripnikova.theatre.repository.repertoire.AgeCategoriesRepository;

import java.util.List;

@Service
public class AgeCategoriesService {

    @Autowired
    private AgeCategoriesRepository ageCategoriesRepository;

    public void addAgeCategories (AgeCategoriesRequest ageCategoriesRequest) {
        Integer nextVal = ageCategoriesRepository.getNextAgeCategoriesId();
        AgeCategories ageCategories = new AgeCategories(nextVal, ageCategoriesRequest.getAgeCategory());
        ageCategoriesRepository.save(ageCategories);
    }

    public void deleteAgeCategories (Integer ageCategoryId) {
        AgeCategories ageCategories = ageCategoriesRepository.getAgeCategoriesByAgeCategoryId(ageCategoryId);
        if (ageCategories == null) {
            //throw not found exception
        }
        ageCategoriesRepository.delete(ageCategories);
    }

    public AgeCategories getAgeCategories (Integer ageCategoryId) {
        return ageCategoriesRepository.getAgeCategoriesByAgeCategoryId(ageCategoryId);
    }

    public void updateAgeCategories (AgeCategories ageCategories, Integer ageCategoryId) {
        if (ageCategoriesRepository.getAgeCategoriesByAgeCategoryId(ageCategoryId) == null) {
            //throw not found exception
        }
        ageCategories.setAgeCategoryId(ageCategoryId);
        ageCategoriesRepository.save(ageCategories);
    }

    public List<AgeCategories> getAllAgeCategories(){
        return ageCategoriesRepository.findAll();
    }
}
