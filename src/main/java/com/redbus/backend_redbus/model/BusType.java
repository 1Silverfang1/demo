package com.redbus.backend_redbus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class BusType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String busType;
    private int busFactor;
    @JsonIgnore
    @OneToOne
    private Bus busTypeId;

    public Bus getBusTypeId() {
        return busTypeId;
    }

    public void setBusTypeId(Bus busTypeId) {
        this.busTypeId = busTypeId;
    }

    public int getId() {
        return id;
    }

    public int getBusFactor() {
        return busFactor;
    }

    public void setBusFactor(int busFactor) {
        this.busFactor = busFactor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }
}
