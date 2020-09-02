// Dock.java
/** The declaration package of class Dock
  * Including the declaration of data members and constructors, accesors methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

import java.util.ArrayList;

// The declaration of the class Dock
public class Dock {
    
    // The declaration of Data members 
    private int dockID;                                 // To store the dock's id
    private String location;                            // To store the dock's location
    private Boolean electricity;                        // To store whether there is electricity supply in this dock
    private Boolean water;                              // To store whether there is water supply in this dock

    private ArrayList<Slip> slipList;                   // Every dock has many slips. to store the slip list 

    // The declaration of methods
    // Default constructor
    public Dock(){
        // initialize the data members        
        this.dockID = 0;
        this.location = "";
        this.electricity = true;
        this.water = true;
        this.slipList = new ArrayList<Slip>();
    }   // End of class Dock

    // The parameterized constructor
    public Dock(int dockID, String location, Boolean electricity, Boolean water) {
        // initialize the data members with parameters
        this.dockID = dockID;
        this.location = location;
        this.electricity = electricity;
        this.water = water;
        this.slipList = new ArrayList<Slip>();
    }   // End of class Dock

    // The getDockID method, return dockID information.    
    public int getDockID() {
        return dockID;
    }   // End of getDockID

    // The setDockID method, set dockID's value.    
    public void setDockID(int dockID) {
        this.dockID = dockID;
    }   // End of setDockID

    // The getLocation method, return location information.    
    public String getLocation() {
        return location;
    }   // End of getLocation

    // The setLocation method, set location's value.
    public void setLocation(String location) {
        this.location = location;
    }   // End of setLocation

    // The getElectricity method, return electricity information.    
    public Boolean getElectricity() {
        return electricity;
    }   // End of getElectricity

    // The setElectricity method, set electricity's value.    
    public void setElectricity(Boolean electricity) {
        this.electricity = electricity;
    }   // End of setElectricity

    // The getWater method, return water information.    
    public Boolean getWater() {
        return water;
    }   // End of getWater

    // The setWater method, set water's value.    
    public void setWater(Boolean water) {
        this.water = water;
    }   // End of setWater

    // The addSlipToDock method, add a new slip information to a dock.    
    public boolean addSlipToDock(Slip slip){

        if (slip == null || slipList.contains(slip)) {
            return false;
        }
        slipList.add(slip);
        return true;

    }   // End of addSlipToDock
    
}   // End of class Dock