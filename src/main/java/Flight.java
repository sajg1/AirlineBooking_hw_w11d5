import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private Airport depAirport;
    private Airport arrAirport;
    private String depTime;

    public Flight(Plane plane, String flightNo, Airport depAirport, Airport arrAirport, String depTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
        this.depTime = depTime;
    }

    public PlaneType getPlane() {
        return this.plane.getPlanetype();
    }

    public int planeCapacity() {
        return this.plane.getCapacity();
    }


    public String getFlightNo() {
        return this.flightNo;
    }

    public Airport getDepAirport() {
        return this.depAirport;
    }

    public Airport getArrAirport() {
        return this.arrAirport;
    }

    public String getDepTime() {
        return this.depTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int spaceAvailable() {
        return planeCapacity() - passengerCount();
    }

    public void bookPassengerOntoFlight(Passenger passenger) {
        if (passengerCount() < planeCapacity())
        this.passengers.add(passenger);
    }
}
