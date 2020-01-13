package com.redbus.backend_redbus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatTypes;

    public String getSeatTypes() {
        return seatTypes;
    }

    public void setSeatTypes(String seatTypes) {
        this.seatTypes = seatTypes;
    }

    private int totalSeat;
    @OneToMany
    private List<Bus> busSeatId= new ArrayList<>();

    public List<Bus> getBusSeatId() {
        return busSeatId;
    }

    public void setBusSeatId(List<Bus> busSeatId) {
        this.busSeatId = busSeatId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }
}
