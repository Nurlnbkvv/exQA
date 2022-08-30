package com.exam.exqa.Model;

import java.util.Date;

public class Ticket {
    private Integer ticket_client_id;
    private Integer ticket_flight_number;
    private Date ticket_pick_up_time;
    private Integer ticket_number;

    public Integer getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(Integer ticket_number) {
        this.ticket_number = ticket_number;
    }

    public Integer getTicket_client_id() {
        return ticket_client_id;
    }

    public void setTicket_client_id(Integer ticket_client_id) {
        this.ticket_client_id = ticket_client_id;
    }

    public Integer getTicket_flight_number() {
        return ticket_flight_number;
    }

    public void setTicket_flight_number(Integer ticket_flight_number) {
        this.ticket_flight_number = ticket_flight_number;
    }

    public Date getTicket_pick_up_time() {
        return ticket_pick_up_time;
    }

    public void setTicket_pick_up_time(Date ticket_pick_up_time) {
        this.ticket_pick_up_time = ticket_pick_up_time;
    }

    public void setTicket_pick_up_time(String nextLine) {
    }
}
