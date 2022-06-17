package fly;

import fly.plane.Plane;

public class Booking {

    private Passenger passenger;
    private Plane plane;

    public Booking(Passenger passenger, Plane plane) {
        this.passenger = passenger;
        this.plane = plane;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public Plane getPlane() {
        return  this.plane;
    }
}
