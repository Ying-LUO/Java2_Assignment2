package Bradshaw_Marina_Project;

public class Sailboat extends Boat {

    public double keelDedpth;
    public int numberSails;
    public MotorType motorType;

    public Sailboat(){
        super();
        this.keelDedpth = 0;
        this.numberSails = 0;
        this.motorType = MotorType.Inboard;
    }

    public Sailboat(String stateRegistrationNO, double boatLength, String manufacturer, int year, double keelDedpth,
            int numberSails, MotorType motorType) {
        super(stateRegistrationNO, boatLength, manufacturer, year);
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

    public MotorType getMotorType() {
        return motorType;
    }

    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }

    @Override
    public String tellAboutSelf() {
        return super.tellAboutSelf() + "Sailboat \n[keelDedpth=" + keelDedpth + 
                        "\nmotorType=" + motorType + 
                        "\nnumberSails=" + numberSails + "]";
    }
    
}