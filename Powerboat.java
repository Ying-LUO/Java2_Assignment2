// Powerboat.java
/** The declaration package of class Powerboat
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package
package Bradshaw_Marina_Project;

// The declaration of the class Powerboat
public class Powerboat extends Boat{

    // The declaration of Data members
    public int numberEngines;                                       // To store the number of engines
    public FuelType fuelType;                                       // To store the fueltype information
    
    // The declaration of methods
    // Default constructor
    public Powerboat(){
        // initialize the data members        
        super();
        this.numberEngines = 0;
        this.fuelType = FuelType.MDO_marine_diesel_oil;
    }   // End of Powerboat
    
    // The parameterized constructor
    public Powerboat(String stateRegistrationNO, double boatLength, String manufacturer, int year, int numberEngines,
                    FuelType fuelType) {
        // initialize the data members with parameters
        super(stateRegistrationNO, boatLength, manufacturer, year);
        this.numberEngines = numberEngines;
        this.fuelType = fuelType;
    }   // End of Powerboat

    // The getNumberEngines method, return numberEngines information.
    public int getNumberEngines() {
        return numberEngines;
    }   // End of getNumberEngines

    // The setNumberEngines method, set numberEngines's value.
    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }   // End of setNumberEngines
    
    // The getFuelType method, return fuelType information.
    public FuelType getFuelType() {
        return fuelType;
    }   // End of getFuelType
    
    // The setFuelType method, set fuelType's value.
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }   // End of setFuelType
    
    // The tellAboutSelf method, return all data members' information within a String.
    @Override
    public String tellAboutSelf() {
        return super.tellAboutSelf() + "Powerboat \n[fuelType=" + fuelType + 
                        "\nnumberEngines=" + numberEngines + "]";
    }   // End of tellAboutSelf
    
}   // End of class Powerboat