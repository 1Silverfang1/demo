package com.redbus.backend_redbus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SeatFare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatName;
    private int seatPrice;
    private boolean isBooked;
    private String seatType;

    public List<Bus> getBusFare() {
        return busFare;
    }

    public void setBusFare(List<Bus> busFare) {
        this.busFare = busFare;
    }

    @ManyToMany
    private List<Bus> busFare = new ArrayList<>();
    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public int getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(int seatPrice) {
        this.seatPrice = seatPrice;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
