package ru.nsu.skripnikova.theatre.entity.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

    public Employees() {
    }

    public Employees(Integer employeeId,
                     String firstName,
                     String lastName,
                     String sex,
                     Date birthDate,
                     Integer numberOfChildren,
                     Integer salary,
                     Date firstWorkDay,
                     Date lastWorkDay,
                     Integer positionId,
                     Integer isStudent) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfChildren = numberOfChildren;
        this.salary = salary;
        this.firstWorkDay = firstWorkDay;
        this.lastWorkDay = lastWorkDay;
        this.positionId = positionId;
        this.isStudent = isStudent;
    }

    @Id
    @Column(name = "EMPLOYEE_ID")
    private Integer employeeId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "NUMBER_OF_CHILDREN")
    private Integer numberOfChildren;

    @Column(name = "SALARY")
    private Integer salary;

    @Column(name = "FIRST_WORK_DAY")
    private Date firstWorkDay;

    @Column(name = "LAST_WORK_DAY")
    private Date lastWorkDay;

    @Column(name = "POSITION_ID")
    private Integer positionId;

    @Column(name = "IS_STUDENT")
    private Integer isStudent;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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

    public Date getFirstWorkDay() {
        return firstWorkDay;
    }

    public void setFirstWorkDay(Date firstWorkDay) {
        this.firstWorkDay = firstWorkDay;
    }

    public Date getLastWorkDay() {
        return lastWorkDay;
    }

    public void setLastWorkDay(Date lastWorkDay) {
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
