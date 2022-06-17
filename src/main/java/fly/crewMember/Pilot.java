package fly.crewMember;

import fly.crewMember.CabinCrewMember;
import fly.crewMember.Rank;

public class Pilot extends CrewMember {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name,rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public String flyThePlane() {
        return "Today I will be your official Pilot!";
    }
}
