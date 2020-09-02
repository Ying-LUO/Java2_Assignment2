// Boat.java
/** The declaration package of class Boat
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class Boat
public abstract class Boat {

    // The declaration of Data members 
    private String stateRegistrationNO;                 // To store the state Registration number
    private double boatLength;                          // To store the boat length data
    private String manufacturer;                        // To store the boat's manufacturer information
    private int year;                                   // To store the boat's date of production

    private Customer customer;                          // To store the boat's owner information. assume one customer has only one boat

    // The declaration of methods
    // Default constructor
    public Boat(){
        // initialize the data members
        this.stateRegistrationNO = "";
        this.boatLength = 0;
        this.manufacturer = "";
        this.year = 0;
    }   // End of Boat 

    // The parameterized constructor
    public Boat(String stateRegistrationNO, double boatLength, String manufacturer, int year) {
        // initialize the data members with parameters
        this.stateRegistrationNO = stateRegistrationNO;
        this.boatLength = boatLength;
        this.manufacturer = manufacturer;
        this.year = year;
    }   // End of Boat

    // The getStateRegistrationNO method, return stateRegistrationNO information.
    public String getStateRegistrationNO() {
        return stateRegistrationNO;
    }   // End of getStateRegistrationNO

    // The setStateRegistrationNO method, set stateRegistrationNO's value.
    public void setStateRegistrationNO(String stateRegistrationNO) {
        this.stateRegistrationNO = stateRegistrationNO;
    }   // End of setStateRegistrationNO

    // The getBoatLength method, return boatLength data.
    public double getBoatLength() {
        return boatLength;
    }   // End of getBoatLength

    // The setBoatLength method, set boatLength's value.
    public void setBoatLength(double boatLength) {
        this.boatLength = boatLength;
    }   // End of setBoatLength

    // The getManufacturer method, return manufacturer information.
    public String getManufacturer() {
        return manufacturer;
    }   // End of getManufacturer

    // The setManufacturer method, set manufacturer's value.
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }   // End of setManufacturer

    // The getYear method, return the date of production information.
    public int getYear() {
        return year;
    }   // End of getYear

    // The setYear method, set year's value.
    public void setYear(int year) {
        this.year = year;
    }   // End of setYear

    // The getCustomer method, return the customer information.    
    public Customer getCustomer() {
        return customer;
    }   // End of getCustomer

    // The setCustomer method, set customer's value.
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }   // End of setCustomer

    // The assignBoatToCustomer method, used in generate a new lease
    // Assigning a boat to the customer    
    public boolean assignBoatToCustomer(Customer customer){

        if (customer == null) {
            return false;
        }
        setCustomer(customer);
        customer.setBoat(this);
        return true;
    }   // End of assignBoatToCustomer

    // The tellAboutSelf method, return all data members' information within a String.
    public String tellAboutSelf(){

        return "Boat \n[boatLength=" + boatLength + 
                    "\nmanufacturer=" + manufacturer + 
                    "\nstateRegistrationNO=" + stateRegistrationNO + 
                    "\nyear=" + year + 
                    "\ncustomer=" + customer.toString() + "]";

    }   // End of tellAboutSelf

}   // End of class Boat