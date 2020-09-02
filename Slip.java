// Slip.java
/** The declaration package of class Slip
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package
package Bradshaw_Marina_Project;

// The declaration of the class Slip
public class Slip {

    // The declaration of Data members 
    private int slipID;                             // To store the slip's ID
    private int width;                              // To store the slip's width
    private double slipLength;                      // To store the slip's length

    private Dock dock;                              // To store the dock information
    
    // The declaration of methods
    // Default constructor
    public Slip(){
        // initialize the data members        
        this.slipID = 0;
        this.width = 0;
        this.slipLength = 0;
    }   // End of Slip
    
    // The parameterized constructor
    public Slip(int slipID, int width, double slipLength) {
        // initialize the data members with parameters
        this.slipID = slipID;
        this.width = width;
        this.slipLength = slipLength;
    }   // End of Slip

    // The leaseSlip method, return the lease fee according to the slip width.
    public double leaseSlip(double width){

        // assume three slip type by width: 12 / 14 / other, not check the invalid value input
        double fee;

        if (width == 12){
            fee = 800; 
        }else if(width == 14){
            fee = 1000;
        }else{
            fee = 600;
        }

        return fee;
    }   // End of leaseSlip

    // The getSlipID method, return slipID information.
    public int getSlipID() {
        return slipID;
    }   // End of getSlipID

    // The setSlipID method, set slipID's value.
    public void setSlipID(int slipID) {
        this.slipID = slipID;
    }   // End of setSlipID

    // The getWidth method, return width information.
    public int getWidth() {
        return width;
    }   // End of getWidth

    // The setWidth method, set width's value.
    public void setWidth(int width) {
        this.width = width;
    }   // End of setWidth

    // The getSlipLength method, return slipLength information.
    public double getSlipLength() {
        return slipLength;
    }   // End of getSlipLength

    // The setSlipLength method, set slipLength's value.
    public void setSlipLength(double slipLength) {
        this.slipLength = slipLength;
    }   // End of setSlipLength

    // The getDock method, return dock information.
    public Dock getDock() {
        return dock;
    }   // End of getDock

    // The setDock method, set dock's value.
    public void setDock(Dock dock) {
        this.dock = dock;
    }   // End of setDock

    // The tellAboutSelf method, return all data members' information within a String.
    public String tellAboutSelf() {
        return "Slip [slipID=" + slipID + "\nslipLength=" + slipLength + "\nwidth="
                + width + "]";
    }   // End of tellAboutSelf

}   // End of class Slip