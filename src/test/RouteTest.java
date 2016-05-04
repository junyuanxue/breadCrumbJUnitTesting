package test;

import com.company.models.Route;
import com.company.models.Waypoint;
import org.junit.Test;

import static org.junit.Assert.*;


public class RouteTest {

    Route route = new Route();

    @Test
    public void starts_with_empty_ArrayList() {
        assertEquals(0, route.getWaypoints().size());
    }

    @Test
    public void can_add_waypoint() {
        Waypoint waypoint = new Waypoint(20.0, 10.0);
        route.addWaypoint(waypoint);
        assertEquals(route.getWaypoints().get(0), waypoint);
    }

    @Test
    public void cannot_add_waypoints_with_invalid_longitude() {
        Waypoint invalidLongitude = new Waypoint(20.0, 200.0);
        assertEquals(false, route.addWaypoint(invalidLongitude));
    }

    @Test
    public void cannot_add_waypoints_with_invalid_latitude() {
        Waypoint invalidLatitude = new Waypoint(200.0, 10.0);
        assertEquals(false, route.addWaypoint(invalidLatitude));
    }
}