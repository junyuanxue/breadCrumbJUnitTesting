package test;

import com.company.models.Waypoint;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WaypointTest {
    Waypoint validWaypoint = new Waypoint(20.0, 10.0);

    @Test
    public void has_latitude() {
        boolean test = validWaypoint.latitude == 20.0;
        assertEquals( true, test );
    }

    @Test
    public void has_longitude() {
        boolean test = validWaypoint.longitude == 10.0;
        assertEquals( true, test );
    }
}