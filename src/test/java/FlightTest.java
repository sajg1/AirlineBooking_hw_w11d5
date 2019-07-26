import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before() {
        plane = new Plane(PlaneType.SKYTUTUT);
        passenger1 = new Passenger("Steve", 1);
        passenger2 = new Passenger("Roisin", 1);
        passenger2 = new Passenger("Andrew", 2);

        flight = new Flight(plane, "F3456", Airport.EDI, Airport.GLA, "1400");
    }

    @Test
    public void hasPlane() {

        assertEquals(PlaneType.SKYTUTUT, flight.getPlane());
    }

    @Test
    public void hasAPlaneCapacity() {

        assertEquals(2, flight.planeCapacity());
    }

    @Test
    public void hasFlightNo() {

        assertEquals("F3456", flight.getFlightNo());
    }

    @Test
    public void hasADepartureAirport() {

        assertEquals(Airport.EDI, flight.getDepAirport());
    }

    @Test
    public void hasArrivalAirport() {

        assertEquals(Airport.GLA, flight.getArrAirport());
    }

    @Test
    public void hasDepartureTime() {

        assertEquals("1400", flight.getDepTime());
    }

    @Test
    public void passengerListStartsEmpty() {

        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void addAPassengerToFlight() {
        flight.bookPassengerOntoFlight(passenger1);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canCheckAvailableSpaceOnFlight() {
        assertEquals(2, flight.spaceAvailable());
        flight.bookPassengerOntoFlight(passenger1);
        assertEquals(1, flight.spaceAvailable());
    }

    @Test
    public void cannotAddMorePassengersThanCapacity() {
        assertEquals(2, flight.spaceAvailable());
        flight.bookPassengerOntoFlight(passenger1);
        assertEquals(1, flight.spaceAvailable());
        flight.bookPassengerOntoFlight(passenger2);
        assertEquals(0, flight.spaceAvailable());
        flight.bookPassengerOntoFlight(passenger3);
        assertEquals(2, flight.passengerCount());
        assertEquals(0, flight.spaceAvailable());
    }
}
