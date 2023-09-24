import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember cabinCrewMember;
    private Flight flight;
    private Pilot pilot;
    private Plane plane;
    @Before
    public void before(){
        cabinCrewMember=new CabinCrewMember("Dev", Rank.FLIGHT_ATTENDANT);
        pilot=new Pilot("Kev","I can fly real good trust me");
        plane=new Plane(PlaneType.BOEING7474747);
        flight=new Flight(new Person[]{pilot,cabinCrewMember},plane,"2","a better place","airport","just a while ago");
    }
    @Test
    public void hasAttributes(){
        assertEquals("Dev",cabinCrewMember.getName());
        assertEquals(Rank.FLIGHT_ATTENDANT,cabinCrewMember.getRank());
    }

    @Test
    public void canAnnounce(){
        assertEquals("The plane which is called BOEING7474747 is crashing & all 40000 passengers will die & my name is Dev",cabinCrewMember.announce(flight));
    }
}
