package fly.plane;

public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlaneType() {
        return this.plane;
    }

    public int getCapacity() {
        return plane.getCapacity();
    }

    public int getWeight() {
        return plane.getWeight();
    }
}
