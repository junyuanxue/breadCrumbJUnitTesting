package test;

import com.company.models.JourneyBack;
import com.company.models.Waypoint;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JourneyBackTest {
    Waypoint first = new Waypoint(50.0,50.0);
    Waypoint second = new Waypoint(100.0,50.0);
    Waypoint third = new Waypoint(0.0,160.0);

    ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>(){{
        add(first);
        add(second);
        add(third);
    }};

    JourneyBack journeyBack = new JourneyBack(waypoints);

    @Test
    public void has_waypoints() {
        assertEquals( true, journeyBack.waypoints.contains(first) );
        assertEquals( true, journeyBack.waypoints.contains(third) );
    }

    @Test
    public void initializes_with_the_correct_next_waypoint() {
        assertEquals( journeyBack.getNextWaypoint(), third );
    }

    @Test
    public void displays_next_waypoint() {
        assertEquals( journeyBack.getNextWaypoint(), third );
    }

    @Test
    public void updates_next_waypoint() {
        journeyBack.updateNextWaypoint();
        assertEquals( journeyBack.getNextWaypoint(), second );
    }
}