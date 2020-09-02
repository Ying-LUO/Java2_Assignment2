// Sailboat.java
/** The declaration package of class Sailboat
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class Sailboat
public class Sailboat extends Boat {

    // The declaration of Data members
    public double keelDedpth;                           // To store the keeldepth data
    public int numberSails;                             // To store the numer of sails
    public MotorType motorType;                         // To store the motor types
    
    // The declaration of methods
    // Default constructor
    public Sailboat(){
        // initialize the data members    
        super();
        this.keelDedpth = 0;
        this.numberSails = 0;
        this.motorType = MotorType.Inboard;
    }   // End of Sailboat
    
    // The parameterized constructor
    public Sailboat(String stateRegistrationNO, double boatLength, String manufacturer, int year, double keelDedpth,
            int numberSails, MotorType motorType) {
        // initialize the data members with parameters                
        super(stateRegistrationNO, boatLength, manufacturer, year);
        this.keelDedpth = keelDedpth;
        this.numberSails = numberSails;
        this.motorType = motorType;
    }   // End of Sailboat

    // The getKeelDedpth method, return keelDedpth information.
    public double getKeelDedpth() {
        return keelDedpth;
    }   // End of getKeelDedpth
    
    // The setKeelDedpth method, set keelDedpth's value.
    public void setKeelDedpth(double keelDedpth) {
        this.keelDedpth = keelDedpth;
    }   // End of setKeelDedpth
    
    // The getNumberSails method, return numberSails information.
    public int getNumberSails() {
        return numberSails;
    }   // End of getNumberSails
    
    // The setNumberSails method, set numberSails's value.
    public void setNumberSails(int numberSails) {
        this.numberSails = numberSails;
    }   // End of setNumberSails
    
    // The getMotorType method, return motorType information.
    public MotorType getMotorType() {
        return motorType;
    }   // End of getMotorType
    
    // The setMotorType method, set motorType's value.
    public void setMotorType(MotorType motorType) {
        this.motorType = motorType;
    }   // End of setMotorType
    
    // The tellAboutSelf method, return all data members' information within a String.
    @Override
    public String tellAboutSelf() {
        return super.tellAboutSelf() + "Sailboat \n[keelDedpth=" + keelDedpth + 
                        "\nmotorType=" + motorType + 
                        "\nnumberSails=" + numberSails + "]";
    }   // End of tellAboutSelf
    
}   // End of class Sailboat