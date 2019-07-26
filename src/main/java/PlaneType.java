public enum PlaneType {

    AIRBUSA380(100, 5000),
    BOEING747(150, 7500),
    SKYTUTUT(2, 100);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
