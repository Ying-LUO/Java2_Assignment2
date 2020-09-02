package Bradshaw_Marina_Project;

public class PersonalWatercraft extends Powerboat {

    private int numberOfPassengers;
    private int topSpeed;

    public PersonalWatercraft(){
        super();
        this.numberOfPassengers = 0;
        this.topSpeed = 0;
    }

    public PersonalWatercraft(String stateRegistrationNO, double boatLength, String manufacturer, int year,
                              int numberEngines, FuelType fuelType, int numberOfPassengers, int topSpeed) {
        super(stateRegistrationNO, boatLength, manufacturer, year, numberEngines, fuelType);
        this.numberOfPassengers = numberOfPassengers;
        this.topSpeed = topSpeed;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String tellAboutSelf() {
        return "PersonalWatercraft{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", topSpeed=" + topSpeed +
                super.tellAboutSelf() +
                '}';
    }
}
