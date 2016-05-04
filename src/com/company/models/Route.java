package com.company.models;

import java.util.ArrayList;

public class Route {
    private ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>();

    public boolean addWaypoint(Waypoint waypoint) {
        if (waypoint.isValid()) {
            waypoints.add(waypoint);
            return true;
        }
        return false;
    }

    public ArrayList getWaypoints() { return waypoints; }

}
