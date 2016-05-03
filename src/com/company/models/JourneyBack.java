package com.company.models;

import java.util.ArrayList;

public class JourneyBack {

    public ArrayList<Waypoint> waypoints;
    public Waypoint nextWaypoint;

    public JourneyBack(ArrayList<Waypoint> routeWaypoints) {
        waypoints = routeWaypoints;
        int index = waypoints.size() - 1;
        nextWaypoint = waypoints.get(index);
    }



}
