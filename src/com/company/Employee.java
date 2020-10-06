package com.company;

import java.util.Date;

class Employee{
    String name;
    String surname;
    Date dateOfBirth;
    JobPosition jobPosition;

    public Employee(String name, String surname, Date dateOfBirth, JobPosition jobPosition) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }
}