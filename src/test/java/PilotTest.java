import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    @Before
    public void before(){
        pilot=new Pilot("Kev","I can fly real good trust me");
        plane=new Plane(PlaneType.BOEING74747);
        flight=new Flight(new CabinCrewMember[]{pilot},plane,null,"pilot's gaff","airport",new Date(1,1,1));
    }
    @Test
    public void hasAttributes(){
        assertEquals("Kev",pilot.getName());
        assertEquals(Rank.PILOT,pilot.getRank());
        assertEquals("I can fly real good trust me",pilot.getLicense());
    }

    @Test
    public void canFly(){
        assertEquals("vrooom I am Kev flying the plane which is called BOEING74747",pilot.fly(flight));
    }
    @Test
    public void cantFly(){
        // shouldn't be able to fly if not the pilot for this flight
        Pilot pilot2=new Pilot("Lev","I can fly even better trust me");
        assertEquals("whoops wrong plane",pilot2.fly(flight));
        // or if pilot doesn't have a valid license
        pilot.setLicense("lost it in the couch");
        assertEquals("haven't got me license",pilot.fly(flight));
    }
}
