package com.redbus.backend_redbus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
public class RouteTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String RouteName;
    private String startingPoint;
    private String endingPoint;
    private HashMap<String,Boolean> routeAvailability= new HashMap<>();

    public HashMap<String, Boolean> getRouteAvailability() {
        return routeAvailability;
    }

    public void setRouteAvailability(HashMap<String, Boolean> routeAvailability) {
        this.routeAvailability = routeAvailability;
    }
    @OneToMany
    private List<PointsTable> routePoint= new ArrayList<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRouteName() {
        return RouteName;
    }

    public void setRouteName(String routeName) {
        RouteName = routeName;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getEndingPoint() {
        return endingPoint;
    }

    public void setEndingPoint(String endingPoint) {
        this.endingPoint = endingPoint;
    }

    public List<PointsTable> getRoutePoint() {
        return routePoint;
    }

    public void setRoutePoint(List<PointsTable> routePoint) {
        this.routePoint = routePoint;
    }
}
