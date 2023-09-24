package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flight {
    private Pilot pilot;
    private CabinCrewMember[] crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String origin;
    private String departureTime;

    public Flight(Person[] _onBoard, Plane _plane, String _flightNumber, String _destination, String _origin, String _departureTime) {
        // this mess is the result of a refusal to let java tell me how to do things
        int crewSize=0;
        for (Person person:_onBoard){
            if (person instanceof CabinCrewMember){
                crewSize++;
            }
        }
        this.crew=new CabinCrewMember[crewSize];
        int i=0;
        this.passengers=new ArrayList<>();
        for (Person person:_onBoard){
            if (person instanceof CabinCrewMember){
                System.out.println();
                this.crew[i]=(CabinCrewMember)person;
                i++;
            } else{
                this.passengers.add((Passenger)person);
            }
        }
        this.pilot=(Pilot)_onBoard[0];
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

    public String getDepartureTime() {
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
