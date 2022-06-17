package fly.crewMember;

public class CabinCrewMember extends CrewMember {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage() {
        return "Thank you for choosing our airline";
    }
}
