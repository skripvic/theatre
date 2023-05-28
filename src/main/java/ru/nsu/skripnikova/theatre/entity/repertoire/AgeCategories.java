package ru.nsu.skripnikova.theatre.entity.repertoire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGE_CATEGORIES")
public class AgeCategories {

    public AgeCategories() {
    }

    public AgeCategories(Integer ageCategoryId, String ageCategory) {
        this.ageCategoryId = ageCategoryId;
        this.ageCategory = ageCategory;
    }

    @Id
    @Column(name = "AGE_CATEGORY_ID")
    private Integer ageCategoryId;

    @Column(name = "AGE_CATEGORY")
    private String ageCategory;

    public Integer getAgeCategoryId() {
        return ageCategoryId;
    }

    public void setAgeCategoryId(Integer ageCategoryId) {
        this.ageCategoryId = ageCategoryId;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }
}
