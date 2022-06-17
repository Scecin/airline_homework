package fly;

import fly.crewMember.CabinCrewMember;
import fly.crewMember.Pilot;
import fly.crewMember.Rank;
import fly.plane.Plane;
import fly.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    Passenger passenger;
    Passenger passenger2;
    Plane plane;
    Plane plane2;
    Booking booking;
    Booking booking2;
    ArrayList<Booking> bookingArrayList;

    @Before
    public void before() {
        pilot = new Pilot("Mary", Rank.CAPTAIN, "EU56789");
        cabinCrewMember = new CabinCrewMember("Peter", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Mark", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Sean", Rank.FLIGHT_ATTENDANT);
        cabinCrewMemberArrayList = new ArrayList<CabinCrewMember>();
        passenger = new Passenger("Silvia", 2);
        passenger2 = new Passenger("Raquel", 1);
        plane = new Plane(PlaneType.A350_900);
        plane2 = new Plane(PlaneType.EMBRAER_175);
        booking = new Booking(passenger, plane);
        booking2 = new Booking(passenger2, plane2);
        bookingArrayList = new ArrayList<Booking>();
        flight = new Flight(pilot, cabinCrewMemberArrayList, bookingArrayList, plane, "FR7612", "EDIN","Glasw","10:00");
    }

    @Test
    public void hasPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void hasCabinCrewMembers() {
        cabinCrewMemberArrayList.add(cabinCrewMember);
        cabinCrewMemberArrayList.add(cabinCrewMember2);
        cabinCrewMemberArrayList.add(cabinCrewMember3);
        assertEquals(3, flight.getCabinCrewMemberSize());
    }

    @Test
    public void hasBookings() {
        bookingArrayList.add(booking);
        bookingArrayList.add(booking2);
        assertEquals(2, flight.getBookingSize());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlyNumber() {
        assertEquals("FR7612", flight.getHasFlyNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDIN", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Glasw", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void CanCheckAvailableSeats() {
        bookingArrayList.add(booking);
        bookingArrayList.add(booking2);
        assertEquals(348, flight.availableSeats());
    }

    @Test
    public void canBookAPassenger() {
        flight.bookAPassenger(booking);
        flight.bookAPassenger(booking2);
        assertEquals(2, flight.getBookingSize());

    }

}