package test;

import com.company.models.Waypoint;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaypointTest {
    Waypoint validWaypoint = new Waypoint(20.0, 10.0);

    @Test
    public void has_latitude() {
        boolean test = validWaypoint.getLatitude() == 20.0;
        assertEquals( true, test );
    }

    @Test
    public void has_longitude() {
        boolean test = validWaypoint.getLongitude() == 10.0;
        assertEquals( true, test );
    }

    @Test
    public void validates_longitude() {
        Waypoint invalidLongitude = new Waypoint(20.0, 200.0);
        assertEquals(false, invalidLongitude.isValid());
    }

    @Test
    public void validates_latitude() {
        Waypoint invalidLatitude = new Waypoint(200.0, 10.0);
        assertEquals(false, invalidLatitude.isValid());
    }
}