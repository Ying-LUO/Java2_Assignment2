// PersonalWatercraft.java
/** The declaration package of class PersonalWatercraft
  * Including the declaration of data members and constructors methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class PersonalWatercraft
public class PersonalWatercraft extends Powerboat {
    
    // The declaration of Data members 
    public int numberOfPassengers;
    public int topSpeed;
    
    // The declaration of methods
    // Default constructor
    public PersonalWatercraft(){
        // initialize the data members        
        super();
        this.numberOfPassengers = 0;
        this.topSpeed = 0;
    }   // End of PersonalWatercraft

    // The parameterized constructor
    public PersonalWatercraft(String stateRegistrationNO, double boatLength, String manufacturer, int year,
            int numberEngines, FuelType fuelType, int numberOfPassengers, int topSpeed) {
        // initialize the data members with parameters
        super(stateRegistrationNO, boatLength, manufacturer, year, numberEngines, fuelType);
        this.numberOfPassengers = numberOfPassengers;
        this.topSpeed = topSpeed;
    }   // End of PersonalWatercraft

    
}   // End of class PersonalWatercraft