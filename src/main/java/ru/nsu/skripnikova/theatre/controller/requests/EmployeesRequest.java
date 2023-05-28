package ru.nsu.skripnikova.theatre.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeesRequest {

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "sex")
    private String sex;

    @JsonProperty(value = "birthDate")
    private String birthDate;

    @JsonProperty(value = "numberOfChildren")
    private Integer numberOfChildren;

    @JsonProperty(value = "salary")
    private Integer salary;

    @JsonProperty(value = "firstWorkDay")
    private String firstWorkDay;

    @JsonProperty(value = "lastWorkDay")
    private String lastWorkDay;

    @JsonProperty(value = "positionId")
    private Integer positionId;

    @JsonProperty(value = "isStudent")
    private Integer isStudent;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFirstWorkDay() {
        return firstWorkDay;
    }

    public void setFirstWorkDay(String firstWorkDay) {
        this.firstWorkDay = firstWorkDay;
    }

    public String getLastWorkDay() {
        return lastWorkDay;
    }

    public void setLastWorkDay(String lastWorkDay) {
        this.lastWorkDay = lastWorkDay;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(Integer isStudent) {
        this.isStudent = isStudent;
    }
}
