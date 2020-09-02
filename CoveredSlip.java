// CoveredSlip.java
/** The declaration package of class CoveredSlip
  * Including the declaration of data members and constructors.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class CoveredSlip
public class CoveredSlip extends Slip{
    
    // The declaration of Data members 
    public double height;                 // To store the height information                       
    public boolean door;                  // To store the door information
    
    // The declaration of methods
    // Default constructor    
    public CoveredSlip() {
        // initialize the data members
        super();
        this.height = 0;
        this.door = true;
    }   // End of CoveredSlip

    // The parameterized constructor
    public CoveredSlip(int slipID, int width, double slipLength, double height, boolean door) {
        // initialize the data members with parameters
        super(slipID, width, slipLength);
        this.height = height;
        this.door = door;
    }   // End of CoveredSlip

    
}   // End of CoveredSlip