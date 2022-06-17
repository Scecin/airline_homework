package fly;

import fly.crewMember.CabinCrewMember;
import fly.crewMember.Pilot;
import fly.crewMember.Rank;
import fly.plane.Plane;
import fly.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightManagerTest {

    FlightManager flightManager;
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
        passenger = new Passenger("Silvia", 2, 32);
        passenger2 = new Passenger("Raquel", 1, 16);
        plane = new Plane(PlaneType.A350_900);
        plane2 = new Plane(PlaneType.EMBRAER_175);
        booking = new Booking(passenger, plane);
        booking2 = new Booking(passenger2, plane2);
        bookingArrayList = new ArrayList<Booking>();
        flight = new Flight(pilot, cabinCrewMemberArrayList, bookingArrayList, plane, "FR7612", "EDIN","Glasw","10:00");
        flightManager = new FlightManager(passenger, flight);
    }

    @Test
    public void hasFlight() {
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void  canCalculateBaggageWeightEachPassengerForFlight() {
        assertEquals(32, flightManager.baggageWeight(), 0.0);
    }

    @Test
    public void checkMaxBaggageWeightCapacityPerFlight() {
        assertEquals(14000, flightManager.maxBaggageWeightCapacityPerFlight());
    }

    @Test
    public void checkTotalWeightForBaggageRemains() {
        assertEquals(13968, flightManager.totalWeightForBaggageRemains(), 0.0);
    }

}