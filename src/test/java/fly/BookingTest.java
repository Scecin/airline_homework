package fly;

import fly.plane.Plane;
import fly.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookingTest {

    Booking booking;
    Passenger passenger;
    Plane plane;

    @Before
    public void before() {
        passenger = new Passenger("Silvia", 2, 16);
        plane = new Plane(PlaneType.EMBRAER_175);
        booking = new Booking(passenger,plane);
    }

    @Test
    public void hasPassenger() {
        assertEquals(passenger, booking.getPassenger());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, booking.getPlane());

    }

}