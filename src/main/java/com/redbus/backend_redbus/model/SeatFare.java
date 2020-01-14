package com.redbus.backend_redbus.model;

import javax.persistence.*;

@Entity
public class SeatFare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatName;
    private int seatPrice;
    private String seatType;
    private String isWindowSeat;
    private String isBooked;
    private String bookingGender;

    public String getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(String isBooked) {
        this.isBooked = isBooked;
    }

    public String getBookingGender() {
        return bookingGender;
    }

    public void setBookingGender(String bookingGender) {
        this.bookingGender = bookingGender;
    }

    public String getIsWindowSeat() {
        return isWindowSeat;
    }
    public void setIsWindowSeat(String isWindowSeat) {
        this.isWindowSeat = isWindowSeat;
    }

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

}
