import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Steve", 1);
        passenger1 = new Passenger("Roisin", 1);
        passenger1 = new Passenger("Andrew", 2);
        plane = new Plane(PlaneType.SKYTUTUT);
        flight = new Flight(plane, "F3456", Airport.EDI, Airport.GLA, "1400");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasPlane() {
        assertEquals(PlaneType.SKYTUTUT, flightManager.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("F3456", flightManager.getFlightNo());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals(Airport.EDI, flightManager.getDepAirport());
    }

    @Test
    public void hasArrivalAirport() {
        assertEquals(Airport.GLA, flightManager.getArrAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("1400", flightManager.getDepTime());
    }

    @Test
    public void hasFlightCapacity() {
        assertEquals(2, flightManager.getFlightCapacity());
    }
}
