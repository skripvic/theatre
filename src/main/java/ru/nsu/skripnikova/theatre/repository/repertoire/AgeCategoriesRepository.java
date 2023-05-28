package ru.nsu.skripnikova.theatre.repository.repertoire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nsu.skripnikova.theatre.entity.repertoire.AgeCategories;

@Repository
public interface AgeCategoriesRepository extends JpaRepository<AgeCategories, Integer> {

    AgeCategories getAgeCategoriesByAgeCategoryId (Integer ageCategoryId);

    @Query(value = "SELECT SEQUENCE_AGE_CATEGORIES.nextval FROM dual", nativeQuery = true)
    Integer getNextAgeCategoriesId();
}
