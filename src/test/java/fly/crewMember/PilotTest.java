package fly.crewMember;

import fly.crewMember.Rank;
import fly.crewMember.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Mary", Rank.FIRST_OFFICER, "AB12345");
    }

    @Test
    public void hasNAme() {
        assertEquals("Mary", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("AB12345", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("Today I will be your official Pilot!", pilot.flyThePlane());
    }

}