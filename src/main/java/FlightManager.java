public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public PlaneType getPlane() {
        return this.flight.getPlane();
    }

    public String getFlightNo() {
        return this.flight.getFlightNo();
    }

    public Airport getDepAirport() {
        return this.flight.getDepAirport();
    }

    public Airport getArrAirport() {
        return this.flight.getArrAirport();
    }

    public String getDepTime() {
        return this.flight.getDepTime();
    }

    public int getFlightCapacity() {
        return this.flight.planeCapacity();
    }
}
