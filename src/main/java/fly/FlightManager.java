package fly;

public class FlightManager {

    private Passenger passenger;
    private Flight flight;

    public FlightManager(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassengers() {
        return this.passenger;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double baggageWeight () {
        return this.passenger.getBaggageWeight();
    }

    public int maxBaggageWeightCapacityPerFlight() {
        return this.flight.getPlane().getCapacity() * this.flight.getMaxBaggageWeight();
    }

    public double totalWeightForBaggageRemains() {
        return this.maxBaggageWeightCapacityPerFlight() - this.baggageWeight();
    }
}
