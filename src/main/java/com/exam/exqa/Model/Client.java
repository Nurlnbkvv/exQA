package com.exam.exqa.Model;

public class Client {
    private Integer inn;
    private String fio;
    private Integer year_of_birth;
    private String gender;
    private String nationality;
    private Integer passport_id;

    public Integer getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(Integer passport_id) {
        this.passport_id = passport_id;
    }

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(Integer year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
