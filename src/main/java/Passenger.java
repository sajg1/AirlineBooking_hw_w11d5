public class Passenger {

    private String name;
    private int noOfBags;
    private Flight onFlight;
    private int seatNumber;

    public Passenger(String name, int noOfBags) {
        this.name = name;
        this.noOfBags = noOfBags;
        this.onFlight = null;
        this.seatNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNoOfBags() {
        return this.noOfBags;
    }

    public Flight isOnFlight() {
        return this.onFlight;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setOnFlight(Flight onFlight) {
        this.onFlight = onFlight;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

