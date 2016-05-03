package com.company.models;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Waypoint {
    public double latitude, longitude;

    public Waypoint(double latitude, double longitude) throws InvalidArgumentException {
        if (Math.abs(latitude) > 90 || Math.abs(longitude) > 180) {
            throw new InvalidArgumentException(new String[]{"Invalid coordinates"});
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
