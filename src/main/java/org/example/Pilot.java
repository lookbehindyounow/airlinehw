package org.example;

public class Pilot extends CabinCrewMember {
    private String license;
    public Pilot(String _name, String _license) {
        super(_name, Rank.PILOT);
        this.license=_license;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }

    public String fly(Flight flight) {
        if (flight.getPilot()==this&&license.contains("trust me")){
            return "vrooom I am "+this.getName()+" flying the plane which is called "+flight.getPlane().getType().toString();
        } else if (flight.getPilot()!=this) {
            return "whoops wrong plane";
        } else{
            return "haven't got me license";
        }
    }
}
