package org.example;

public class CabinCrewMember extends Person{
    private Rank rank;
    public CabinCrewMember(String _name, Rank _rank) {
        super(_name);
        this.rank=_rank;
    }
    public Rank getRank(){
        return rank;
    }

    public String announce(Flight flight){
        return "The plane which is called "+flight.getPlane().getType().toString()+" is crashing & all "+flight.getPlane().getType().getCapacity()+" passengers will die & my name is "+getName();
    }
}
