package com.redbus.backend_redbus;

import com.redbus.backend_redbus.model.RouteTable;
import com.redbus.backend_redbus.model.Timing;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class ResponseBody {
    private String busName;
    private String busNumber;
    private HashMap<String,List<String>> busTickets;
    private String busDriver;
    private String busType;
    private String duration;
    private String startingPrice;

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

    public HashMap<String, List<String>> getBusTickets() {
        return busTickets;
    }

    public void setBusTickets(HashMap<String, List<String>> busTickets) {
        this.busTickets = busTickets;
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
