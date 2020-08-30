package Bradshaw_Marina_Project;

public abstract class Boat {

    public String stateRegistrationNO;
    public double boatLength;
    public String manufacturer;
    public int year;

    public abstract boolean assignBoatToSlip(Slip slip);
    public abstract boolean removeBoatFromSlip(Slip slip);

    public String tellAboutSelf(){

        return "Boat \n[boatLength=" + boatLength + 
                    "\nmanufacturer=" + manufacturer + 
                    "\nstateRegistrationNO=" + stateRegistrationNO + 
                    "\nyear=" + year + "]";

    }

    public Boat(){
        this.stateRegistrationNO = "";
        this.boatLength = 0;
        this.manufacturer = "";
        this.year = 0;
    }

    public Boat(String stateRegistrationNO, double boatLength, String manufacturer, int year) {
        this.stateRegistrationNO = stateRegistrationNO;
        this.boatLength = boatLength;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getStateRegistrationNO() {
        return stateRegistrationNO;
    }

    public void setStateRegistrationNO(String stateRegistrationNO) {
        this.stateRegistrationNO = stateRegistrationNO;
    }

    public double getBoatLength() {
        return boatLength;
    }

    public void setBoatLength(double boatLength) {
        this.boatLength = boatLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
 

}