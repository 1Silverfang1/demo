package com.redbus.backend_redbus.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Timing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date departureTime;
    private Date arrivalTime;
    private String finalSource;
    private String finalDestination;
    @JsonIgnore
    @OneToOne
    private Bus busTimingId;

    public Bus getBusTimingId() {
        return busTimingId;
    }

    public void setBusTimingId(Bus busTimingId) {
        this.busTimingId = busTimingId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFinalSource() {
        return finalSource;
    }

    public void setFinalSource(String finalSource) {
        this.finalSource = finalSource;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }
}

