package org.example;

public enum PlaneType {
    BOEING747(400,183_500),
    BOEING74747(4000,1_835_000),
    BOEING7474747(40000,18_350_000),
    BOEING(7,3);
    private final int capacity;
    private final double weight;
    PlaneType(int _capacity, double _weight){
        this.capacity=_capacity;
        this.weight=_weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
