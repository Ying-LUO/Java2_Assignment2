package Bradshaw_Marina_Project;

public class CruisingSailboat extends Sailboat{

    private String lifeRaftManufacturer;

    public CruisingSailboat(){
        super();
        this.lifeRaftManufacturer = "";
    }

    public CruisingSailboat(String stateRegistrationNO, double boatLength, String manufacturer, int year,
                            double keelDedpth, int numberSails, MotorType motorType, String lifeRaftManufacturer) {
        super(stateRegistrationNO, boatLength, manufacturer, year, keelDedpth, numberSails, motorType);
        this.lifeRaftManufacturer = lifeRaftManufacturer;
    }

    public String getLifeRaftmanufacturer() {
        return lifeRaftManufacturer;
    }

    public void setLifeRaftManufactor(String lifeRaftManufacturer) {
        this.lifeRaftManufacturer = lifeRaftManufacturer;
    }

    @Override
    public String tellAboutSelf() {
        return "CruisingSailboat \t[" + "lifeRaftManufacturer='" + lifeRaftManufacturer + super.tellAboutSelf() + "]\n";
    }

}
