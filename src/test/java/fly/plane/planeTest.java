package fly.plane;

import fly.plane.Plane;
import fly.plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class planeTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void hasWeight() {
        assertEquals(183500, plane.getWeight());

    }

}