package com.redbus.backend_redbus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Entity
public class BusTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private HashMap<String, List<String>> ticketDetails;

    public HashMap<String, List<String>> getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(HashMap<String, List<String>> ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    @JsonIgnore
    @OneToOne
    private Bus busToTicket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bus getBusToTicket() {
        return busToTicket;
    }

    public void setBusToTicket(Bus busToTicket) {
        this.busToTicket = busToTicket;
    }
}
