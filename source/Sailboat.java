public class Sailboat extends Boat{

    public double keelDedpth;
    public int numberSails;
    public String[] motorType = {};

    public Sailboat(String stateRegistrationNO, double boatLength, String manufactor, int year, double keelDedpth,
            int numberSails, String[] motorType) {
        super(stateRegistrationNO, boatLength, manufactor, year);
        this.keelDedpth = keelDedpth;
        this.numberSails = numberSails;
        this.motorType = motorType;
    }

    public double getKeelDedpth() {
        return keelDedpth;
    }

    public void setKeelDedpth(double keelDedpth) {
        this.keelDedpth = keelDedpth;
    }

    public int getNumberSails() {
        return numberSails;
    }

    public void setNumberSails(int numberSails) {
        this.numberSails = numberSails;
    }

    public String[] getMotorType() {
        return motorType;
    }

    public void setMotorType(String[] motorType) {
        this.motorType = motorType;
    }

    @Override
    public void assignBoatToSlip() {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeBoatFromSlip() {
        // TODO Auto-generated method stub

    }

    @Override
    public String tellAboutSelf() {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}