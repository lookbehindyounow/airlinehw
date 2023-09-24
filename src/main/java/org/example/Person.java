package org.example;

public abstract class Person {
    private String name;
    public Person(String _name){
        this.name=_name;
    }
    public String getName(){
        return name;
    }
}
