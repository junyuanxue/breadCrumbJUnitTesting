package com.company.models;

import java.util.ArrayList;

public class JourneyBack {

    public ArrayList<Waypoint> waypoints;
    public Waypoint currentWaypoint;

    public JourneyBack(ArrayList<Waypoint> routeWaypoints) {
        waypoints = routeWaypoints;
        int index = waypoints.size() - 1;
        currentWaypoint = waypoints.get(index);
    }



}
