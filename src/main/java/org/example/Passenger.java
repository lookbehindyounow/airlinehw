package org.example;

public class Passenger extends Person {
    private int bags;
    public Passenger(String _name, int _bags) {
        super(_name);
        this.bags=_bags;
    }
    public int getBags(){
        return bags;
    }
}
