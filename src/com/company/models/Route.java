package com.company.models;

import java.util.ArrayList;

public class Route {
    public ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>();

    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }

}
