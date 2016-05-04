package com.company.models;

import java.util.ArrayList;

public class Route {
    private ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>();

    public boolean addWaypoint(Waypoint waypoint) {
        if (isValidWaypoint(waypoint)) {
            waypoints.add(waypoint);
            return true;
        }
        return false;
    }

    private boolean isValidWaypoint(Waypoint waypoint) {
        return Math.abs(waypoint.getLatitude()) <= 90 && Math.abs(waypoint.getLongitude()) <= 180;
    }

    public ArrayList getWaypoints() { return waypoints; }

}
