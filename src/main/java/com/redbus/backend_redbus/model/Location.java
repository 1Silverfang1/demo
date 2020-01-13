package com.redbus.backend_redbus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String stopPoints;
    @ManyToMany
    private List<Bus> busList=new ArrayList<>();
    public int getId() {
        return id;
    }

    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStopPoints() {
        return stopPoints;
    }

    public void setStopPoints(String stopPoints) {
        this.stopPoints = stopPoints;
    }
}
