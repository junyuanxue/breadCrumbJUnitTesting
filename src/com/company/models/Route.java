package com.company.models;

import java.util.ArrayList;

public class Route {
    public ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>();

    public boolean addWaypoint(Waypoint waypoint) {
        if (isValidWaypoint(waypoint)) {
            waypoints.add(waypoint);
            return true;
        }
        return false;
    }

    private boolean isValidWaypoint(Waypoint waypoint) {
        return Math.abs(waypoint.latitude) <= 90 && Math.abs(waypoint.longitude) <= 180;
    }

}
