package test;

import com.company.models.Route;
import com.company.models.Waypoint;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class RouteTest {

    Route route = new Route();

    @Test
    public void starts_with_empty_ArrayList() {
        assertEquals(0, route.getWaypoints().size());
    }

    @Test
    public void can_add_waypoint() {
        Waypoint waypoint = mock(Waypoint.class);
        route.addWaypoint(waypoint);
        assertEquals(route.getWaypoints().get(0), waypoint);
    }

}