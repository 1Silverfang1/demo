package com.redbus.backend_redbus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String busName;
    private String busNumber;
    @ManyToMany
    private List<Location> locationList= new ArrayList<>();
    @ManyToMany
    private List<SeatFare> seatFaresList = new ArrayList<>();
    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public Timing getBusTiming() {
        return busTiming;
    }

    public void setBusTiming(Timing busTiming) {
        this.busTiming = busTiming;
    }

    @OneToOne(mappedBy = "busTimingId")
    private Timing busTiming;
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @OneToOne
    private Seat seat;
    public BusDriver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(BusDriver busDriver) {
        this.busDriver = busDriver;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    @OneToOne(mappedBy = "busTypeId")
    private BusType busType;
    @OneToOne(mappedBy = "busId")
    private BusDriver busDriver;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public List<SeatFare> getSeatFaresList() {
        return seatFaresList;
    }

    public void setSeatFaresList(List<SeatFare> seatFaresList) {
        this.seatFaresList = seatFaresList;
    }
}
