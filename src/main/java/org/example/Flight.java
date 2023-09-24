package org.example;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Pilot pilot;
    private CabinCrewMember[] crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private Date departureTime;

    public Flight(CabinCrewMember[] _crew, Plane _plane, String _flightNumber, String _destination, String _origin, Date _departureTime) {
        this.pilot=(Pilot)_crew[0];
        this.crew=_crew;
        this.passengers=new ArrayList<>();
        this.plane = _plane;
        this.flightNumber = _flightNumber;
        this.destination = _destination;
        this.origin = _origin;
        this.departureTime = _departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public CabinCrewMember[] getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public int availableSeats() {
        return plane.getType().getCapacity() - crew.length - passengers.size();
    }

    public boolean book(Passenger passenger) {
        if (availableSeats()>0){
            passengers.add(passenger);
            return true;
        } else{
            return false;
        }
    }
}
