package fly.crewMember;

import fly.crewMember.CabinCrewMember;
import fly.crewMember.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("David", Rank.CAPTAIN);
    }

    @Test
    public void hasNAme() {
        assertEquals("David", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, cabinCrewMember.getRank());
    }

    @Test
    public void CanRelayMessagesToPassengers() {
        assertEquals("Thank you for choosing our airline", cabinCrewMember.relayMessage());
    }

}