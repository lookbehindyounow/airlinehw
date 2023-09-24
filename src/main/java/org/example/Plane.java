package org.example;

public class Plane {
    private PlaneType type;

    public Plane(PlaneType _type) {
        this.type = _type;
    }

    public PlaneType getType() {
        return type;
    }
}
