package com.redbus.backend_redbus;

import com.redbus.backend_redbus.model.BusTicket;
import com.redbus.backend_redbus.model.RouteTable;
import com.redbus.backend_redbus.model.SeatFare;
import com.redbus.backend_redbus.model.Timing;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class ResponseBody {
    private String busName;
    private String busNumber;
    private String busDriver;
    private String busType;
    private String duration;
    private String startingPrice;
    private List<SeatFare> seatFareList= new ArrayList<>();

    public List<SeatFare> getSeatFareList() {
        return seatFareList;
    }

    public void setSeatFareList(List<SeatFare> seatFareList) {
        this.seatFareList = seatFareList;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }
    private Date departure;
    private Date arrival;
    private int totalSeats;
    private RouteTable routeTable;

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
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


    public String getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(String busDriver) {
        this.busDriver = busDriver;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public RouteTable getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }
}
