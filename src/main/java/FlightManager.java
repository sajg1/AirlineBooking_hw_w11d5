import java.util.ArrayList;

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

    public int getTotalBaggageWeight() {
        return this.flight.totalBaggageWeight();
    }

    public ArrayList<Passenger> bookedPassengers() {
        return new ArrayList<Passenger>(this.flight.getPassengers());
    }

    public int countBookedPassengers() {
        return bookedPassengers().size();
    }

    public int getIndividualBagWeight() {
        return this.flight.individualBagWeight();
    }

    public int bookedBaggageWeight() {
        int totalBaggageWeight = 0;
        for (Passenger passenger : bookedPassengers()) {
            totalBaggageWeight += getIndividualBagWeight();
        }
        return totalBaggageWeight;
    }

    public int baggageWeightAllocationRemaining() {
        return getTotalBaggageWeight() - bookedBaggageWeight();
    }



}
