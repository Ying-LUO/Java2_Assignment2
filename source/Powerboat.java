public class Powerboat extends Boat{

    public int numberEngines;
    public FuelType fuelType;

    public Powerboat(String stateRegistrationNO, double boatLength, String manufacturer, int year, int numberEngines,
                    FuelType fuelType) {
        super(stateRegistrationNO, boatLength, manufacturer, year);
        this.numberEngines = numberEngines;
        this.fuelType = fuelType;
    }

    public int getNumberEngines() {
        return numberEngines;
    }

    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
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