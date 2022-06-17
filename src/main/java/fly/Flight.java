package fly;

import fly.crewMember.CabinCrewMember;
import fly.crewMember.Pilot;
import fly.plane.Plane;
import fly.plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    private ArrayList<Booking> bookings;
    private Plane plane;
    private String flyNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMemberArrayList, ArrayList<Booking> bookings,
                  Plane plane, String flyNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMemberArrayList = cabinCrewMemberArrayList;
        this.bookings = bookings;
        this.plane = plane;
        this.flyNumber = flyNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public int getCabinCrewMemberSize() {
        return this.cabinCrewMemberArrayList.size();
    }

    public int getBookingSize() {
        return this.bookings.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getHasFlyNumber() {
        return this.flyNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.bookings.size();
    }

    public void bookAPassenger(Booking booking){
        if( availableSeats()>0) {
            this.bookings.add(booking);
        }
    }
}
