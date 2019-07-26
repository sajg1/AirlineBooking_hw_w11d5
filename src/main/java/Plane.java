public class Plane {

    private PlaneType planetype;

    public Plane(PlaneType planetype){
        this.planetype = planetype;
    };

    public PlaneType getPlanetype() {
        return this.planetype;
    }

    public int getCapacity() {
        return this.planetype.getCapacity();
    }

    public int getTotalWeight() {
        return this.planetype.getTotalWeight();
    }

    public int totalBaggageWeight() {
        return this.planetype.getTotalWeight() / 2;
    }

    public int individualBagWeight() {
        return totalBaggageWeight() / this.planetype.getCapacity();
    }
}
