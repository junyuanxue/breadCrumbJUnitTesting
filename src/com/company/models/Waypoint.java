package com.company.models;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Waypoint {
    public double latitude, longitude;

    public Waypoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
