package fly;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Silvia", 2, 32);
    }

    @Test
    public void hasName() {
        assertEquals("Silvia", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canChangeName() {
        passenger.setName("Raquel");
        assertEquals("Raquel", passenger.getName());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger.setNumberOfBags(1);
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void canCalculateBaggageWeight() {
        assertEquals(32, passenger.getBaggageWeight(), 0.0);
    }

}