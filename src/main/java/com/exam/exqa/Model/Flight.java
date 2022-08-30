package com.exam.exqa.Model;

public class Flight {
    private String airplane_model;
    private String departure_time;
    private String departure_point;
    private String place_of_arrival;
    private Integer flight_duration;
    private Integer number_of_seats;
    private Integer flight_number;

    public Integer getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(Integer flight_number) {
        this.flight_number = flight_number;
    }

    public String getAirplane_model() {
        return airplane_model;
    }

    public void setAirplane_model(String airplane_model) {
        this.airplane_model = airplane_model;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getDeparture_point() {
        return departure_point;
    }

    public void setDeparture_point(String departure_point) {
        this.departure_point = departure_point;
    }

    public String getPlace_of_arrival() {
        return place_of_arrival;
    }

    public void setPlace_of_arrival(String place_of_arrival) {
        this.place_of_arrival = place_of_arrival;
    }

    public Integer getFlight_duration() {
        return flight_duration;
    }

    public void setFlight_duration(Integer flight_duration) {
        this.flight_duration = flight_duration;
    }

    public Integer getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(Integer number_of_seats) {
        this.number_of_seats = number_of_seats;
    }
}
