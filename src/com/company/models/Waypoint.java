package com.company.models;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Waypoint {
    private double latitude, longitude;

    public Waypoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() { return latitude; }

    public double getLongitude() { return longitude; }
}
