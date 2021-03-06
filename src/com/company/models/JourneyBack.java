package com.company.models;

import java.util.ArrayList;

public class JourneyBack {

    private ArrayList<Waypoint> waypoints;
    private Waypoint nextWaypoint;

    public JourneyBack(ArrayList<Waypoint> routeWaypoints) {
        waypoints = routeWaypoints;
        int index = waypoints.size() - 1;
        nextWaypoint = waypoints.get(index);
    }

    public ArrayList getWaypoints() { return waypoints; }

    public Waypoint getNextWaypoint() {
        return nextWaypoint;
    }

    public void updateNextWaypoint() {
        int index = waypoints.indexOf(nextWaypoint) - 1;
        nextWaypoint = waypoints.get(index);
    }

}
