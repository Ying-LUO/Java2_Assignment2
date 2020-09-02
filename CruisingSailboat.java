// CruisingSailboat.java
/** The declaration package of class CruisingSailboat
  * Including the declaration of data members and constructors, accesors methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class CruisingSailboat
public class CruisingSailboat extends Sailboat {
    
    // The declaration of Data members 
    public String lifeRaftManufacturer;             // To store the lifeRaftManufacturer information

    // The declaration of methods
    // Default constructor    
    public CruisingSailboat(){
        // initialize the data members        
        super();
        this.lifeRaftManufacturer = "";
    }   // End of CruisingSailboat

    // The parameterized constructor    
    public CruisingSailboat(String stateRegistrationNO, double boatLength, String manufacturer, int year,
            double keelDedpth, int numberSails, MotorType motorType, String lifeRaftManufacturer) {
        // initialize the data members with parameters
        super(stateRegistrationNO, boatLength, manufacturer, year, keelDedpth, numberSails, motorType);
        this.lifeRaftManufacturer = lifeRaftManufacturer;
    }   // End of CruisingSailboat

    // The getLifeRaftmanufacturer method, return the lifeRaftManufacturer information.      
    public String getLifeRaftmanufacturer() {
        return lifeRaftManufacturer;
    }   // End of getLifeRaftmanufacturer

    // The setLifeRaftManufactor method, set lifeRaftManufacturer's value.
    public void setLifeRaftManufactor(String lifeRaftManufacturer) {
        this.lifeRaftManufacturer = lifeRaftManufacturer;
    }   // End of setLifeRaftManufactor
    
    
}   // End of class CruisingSailboat