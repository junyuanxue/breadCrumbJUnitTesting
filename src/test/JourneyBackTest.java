package test;

import com.company.models.JourneyBack;
import com.company.models.Waypoint;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class JourneyBackTest {
    Waypoint first = mock(Waypoint.class);
    Waypoint second = mock(Waypoint.class);
    Waypoint third = mock(Waypoint.class);

    ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>(){{
        add(first);
        add(second);
        add(third);
    }};

    JourneyBack journeyBack = new JourneyBack(waypoints);

    @Test
    public void has_waypoints() {
        assertEquals( true, journeyBack.getWaypoints().contains(first) );
        assertEquals( true, journeyBack.getWaypoints().contains(third) );
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