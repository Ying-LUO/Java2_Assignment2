// Customer.java
/** The declaration package of class Customer
  * Including the declaration of data members and constructors, accesors methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

// The declaration of the class Customer
public class Customer {
    
    // The declaration of Data members 
    private String name;                                    // To store the customer's name
    private String address;                                 // To store the customer's address                             
    private String phoneNo;                                 // To store the customer's phone number

    private Boat boat;                                      // To store the customer's boat information

    // The declaration of methods
    // Default constructor
    public Customer(){
        // initialize the data members
        this.name = "";
        this.address = "";
        this.phoneNo = "";
    }   // End of Customer

    // The parameterized constructor
    public Customer(String name, String address, String phoneNo) {
        // initialize the data members with parameters
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }   // End of Customer

    // The getName method, return name information.    
    public String getName() {
        return name;
    }   // End of getName

    // The setName method, set name's value.
    public void setName(String name) {
        this.name = name;
    }   // End of setName

    // The getAddress method, return address information.    
    public String getAddress() {
        return address;
    }   // End of getAddress

    // The setAddress method, set address's value.
    public void setAddress(String address) {
        this.address = address;
    }   // End of setAddress

    // The getPhoneNo method, return phoneNo information.    
    public String getPhoneNo() {
        return phoneNo;
    }   // End of getPhoneNo

    // The setPhoneNo method, set phoneNo's value.    
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }   // End of setPhoneNo

    // The getBoat method, return boat information.    
    public Boat getBoat() {
        return boat;
    }   // End of getBoat

    // The setBoat method, set boat's value.    
    public void setBoat(Boat boat) {
        this.boat = boat;
    }   // End of setBoat

    

}   // End of class Customer