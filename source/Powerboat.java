public class Powerboat extends Boat{

    public int numberEngines;
    public String[] fuelType = {};

    public Powerboat(String stateRegistrationNO, double boatLength, String manufactor, int year, int numberEngines,
            String[] fuelType) {
        super(stateRegistrationNO, boatLength, manufactor, year);
        this.numberEngines = numberEngines;
        this.fuelType = fuelType;
    }

    public int getNumberEngines() {
        return numberEngines;
    }

    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }

    public String[] getFuelType() {
        return fuelType;
    }

    public void setFuelType(String[] fuelType) {
        this.fuelType = fuelType;
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