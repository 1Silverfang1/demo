package com.redbus.backend_redbus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String locationName;

    public List<PointsTable> getLocationPoints() {
        return locationPoints;
    }

    public void setLocationPoints(List<PointsTable> locationPoints) {
        this.locationPoints = locationPoints;
    }
    @OneToMany
    private List<PointsTable> locationPoints =new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
