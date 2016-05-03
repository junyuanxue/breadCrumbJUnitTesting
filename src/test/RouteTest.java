package test;

import com.company.models.Route;
import com.company.models.Waypoint;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import static org.junit.Assert.*;


public class RouteTest {

    Route route = new Route();

    @Test
    public void starts_with_empty_ArrayList() {
        assertEquals(0, route.waypoints.size());
    }

    @Test
    public void can_add_waypoint() {
        Waypoint waypoint = null;
        try {
            waypoint = new Waypoint(20.0, 10.0);
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
        route.addWaypoint(waypoint);
        assertEquals(route.waypoints.get(0), waypoint);
    }
}