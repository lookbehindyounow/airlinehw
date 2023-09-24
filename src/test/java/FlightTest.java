import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Pilot crewMember1;
    private CabinCrewMember crewMember2;
    private CabinCrewMember crewMember3;
    private CabinCrewMember crewMember4;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;

    @Before
    public void before(){
        crewMember1=new Pilot("Kev","I can fly real good trust me");
        crewMember2=new CabinCrewMember("Pev", Rank.FIRST_OFFICER);
        crewMember3=new CabinCrewMember("Dev", Rank.FLIGHT_ATTENDANT);
        crewMember4=new CabinCrewMember("Mev", Rank.FLIGHT_ATTENDANT);
        plane=new Plane(PlaneType.BOEING);
        flight=new Flight(new Person[]{crewMember1,crewMember2,crewMember3,crewMember4},plane,"1","Spain","Newcastle","early in the morning");
        passenger1=new Passenger("Stev",1);
        passenger2=new Passenger("Gev",2);
    }
    @Test
    public void hasAttributes() {
        assertEquals(crewMember1, flight.getPilot());
        assertEquals(new CabinCrewMember[]{crewMember1, crewMember2, crewMember3, crewMember4}, flight.getCrew());
        assertEquals(new ArrayList<>(), flight.getPassengers());
        assertEquals(plane, flight.getPlane());
        assertEquals("1", flight.getFlightNumber());
        assertEquals("Spain", flight.getDestination());
        assertEquals("Newcastle", flight.getOrigin());
        assertEquals("early in the morning", flight.getDepartureTime());
    }

    @Test
    public void returnsAvailableSeats(){
        assertEquals(3,flight.availableSeats());
    }
    @Test
    public void canBook(){
        boolean isBooked=flight.book(passenger1);
        assertEquals(passenger1,flight.getPassengers().get(0));
        assertEquals(true,isBooked);
    }
    @Test
    public void cantBookTooMany(){
        for (int i=0;i<3;i++){
            flight.book(passenger1);
        }
        assertEquals(new ArrayList<>(Arrays.asList(passenger1,passenger1,passenger1)),flight.getPassengers());
        assertEquals(0,flight.availableSeats());

        boolean isBooked=flight.book(passenger2);
//        assertEquals(false,isBooked);
        assertEquals(false,flight.getPassengers().contains(passenger2));
    }
}
