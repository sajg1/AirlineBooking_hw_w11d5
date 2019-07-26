import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {


    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA380);
    }

    @Test
    public void hasType() {
        assertEquals(PlaneType.AIRBUSA380, plane.getPlanetype());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(5000, plane.getTotalWeight());
    }

    @Test
    public void hasATotalBaggageWeight() {
        assertEquals(2500, plane.totalBaggageWeight());
    }

    @Test
    public void hasAnIndividualBagWeight() {
        assertEquals(25, plane.individualBagWeight());
    }


}
