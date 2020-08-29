public abstract class Boat{

    public String stateRegistrationNO;
    public double boatLength;
    public String manufactor;
    public int year;

    public abstract void assignBoatToSlip();
    public abstract void removeBoatFromSlip();
    public abstract String tellAboutSelf();

    public Boat(String stateRegistrationNO, double boatLength, String manufactor, int year) {
        this.stateRegistrationNO = stateRegistrationNO;
        this.boatLength = boatLength;
        this.manufactor = manufactor;
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

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

}