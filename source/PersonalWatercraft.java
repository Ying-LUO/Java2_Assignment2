public class PersonalWatercraft extends Powerboat {

    public int numberOfPassengers;
    public int topSpeed;

    public PersonalWatercraft(String stateRegistrationNO, double boatLength, String manufacturer, int year,
            int numberEngines, FuelType fuelType, int numberOfPassengers, int topSpeed) {
        super(stateRegistrationNO, boatLength, manufacturer, year, numberEngines, fuelType);
        this.numberOfPassengers = numberOfPassengers;
        this.topSpeed = topSpeed;
    }

    
}