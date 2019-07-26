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
        passenger2 = new Passenger("Roisin", 1);
        passenger3 = new Passenger("Andrew", 2);
        plane = new Plane(PlaneType.SKYTUTUT);
        flight = new Flight(plane, "F3456", Airport.EDI, Airport.GLA, "1400");
        flight.bookPassengerOntoFlight(passenger1);
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

    @Test
    public void hasTotalBaggageWeightForFlight() {
        assertEquals(50, flightManager.getTotalBaggageWeight());
    }

    @Test
    public void hasIndividualBaggageForEachPassenger() {
        assertEquals(25, flightManager.getIndividualBagWeight());
    }

    @Test
    public void canCountBookedPassengers() {
        assertEquals(1, flightManager.countBookedPassengers());
    }

    @Test
    public void checkBookedBaggageForAFlight() {
        assertEquals(25, flightManager.bookedBaggageWeight());
        flight.bookPassengerOntoFlight(passenger2);
        assertEquals(50, flightManager.bookedBaggageWeight());

    }

    @Test
    public void checkRemainingBaggageAllocationForFlight() {
        assertEquals(25, flightManager.baggageWeightAllocationRemaining());
        flight.bookPassengerOntoFlight(passenger2);
        assertEquals(0, flightManager.baggageWeightAllocationRemaining());
        flight.bookPassengerOntoFlight(passenger3);
        assertEquals(0, flightManager.baggageWeightAllocationRemaining());
        
    }
}

