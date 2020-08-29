public class CruisingSailboat extends Sailboat{

    public String lifeRaftManufactor;

    public CruisingSailboat(String stateRegistrationNO, double boatLength, String manufactor, int year,
            double keelDedpth, int numberSails, String[] motorType, String lifeRaftManufactor) {
        super(stateRegistrationNO, boatLength, manufactor, year, keelDedpth, numberSails, motorType);
        this.lifeRaftManufactor = lifeRaftManufactor;
    }

    public String getLifeRaftManufactor() {
        return lifeRaftManufactor;
    }

    public void setLifeRaftManufactor(String lifeRaftManufactor) {
        this.lifeRaftManufactor = lifeRaftManufactor;
    }
    
    
}