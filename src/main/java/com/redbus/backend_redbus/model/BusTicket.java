package com.redbus.backend_redbus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
public class BusTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
