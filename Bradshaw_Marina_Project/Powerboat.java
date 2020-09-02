package Bradshaw_Marina_Project;

public class Powerboat extends Boat{

    private int numberEngines;
    private FuelType fuelType;

    public Powerboat(){
        super();
        this.numberEngines = 0;
        this.fuelType = FuelType.MDO_marine_diesel_oil;
    }

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
    public String tellAboutSelf() {
        return "\tPowerboat \t[fuelType=" + fuelType +
                "\tnumberEngines=" + numberEngines + super.tellAboutSelf() + "]\n";
    }
}
