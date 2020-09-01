// Lease.java
/** The declaration package of class Lease
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

import java.util.Date;

// The declaration of the class Lease
public abstract class Lease {

    // The declaration of Data members 
    private double amount;                              // To store the lease fee per day
    private Date startDate;                             // To store a lease's start date
    private Date endDate;                               // To store a lease's end date

    private Customer customer;                          // To store a lease's customer information
    private Slip slip;                                  // To store a lease's slip information
    
    // The declaration of methods
    // Default constructor
    public Lease(){
        // initialize the data members
        this.amount = 0;
        this.startDate = new Date(0);
        this.endDate = new Date(0);
    }   // End of Lease
    
    // The parameterized constructor
    public Lease(double amount, Date startDate, Date endDate, Customer customer, Slip slip) {
        // initialize the data members with parameters
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.slip = slip;
    }   // End of Lease
    
    // The getAmount method, return amount information.
    public double getAmount() {
        return amount;
    }   // End of getAmount
    
    // The setAmount method, set amount's value.
    public void setAmount(double amount) {
        this.amount = amount;
    }   // End of setAmount
    
    // The getStartDate method, return startDate information.
    public Date getStartDate() {
        return startDate;
    }   // End of getStartDate
    
    // The setStartDate method, set setStartDate's value.
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }   // End of setStartDate
    
    // The getEndDate method, return endDate information.
    public Date getEndDate() {
        return endDate;
    }   // End of getEndDate
    
    // The setEndDate method, set endDate's value.
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }   // End of setEndDate
    
    // The getCustomer method, return customer information.
    public Customer getCustomer() {
        return customer;
    }   // End of getCustomer
    
    // The setCustomer method, set customer's value.
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }   // End of setCustomer
    
    // The getSlip method, return slip information.
    public Slip getSlip() {
        return slip;
    }   // End of getSlip
    
    // The setSlip method, set slip's value.
    public void setSlip(Slip slip) {
        this.slip = slip;
    }   // End of setSlip

    // The calculateFee method, calculate and return the lease fee.It's a abstract method and without method body.    
    public abstract double calculateFee(int width);

    // The tellAboutSelf method, return all data members' information within a String.
    public String tellAboutSelf() {
        return "Lease [amount=" + amount + ", customer=" + customer + ", endDate=" + endDate + ", slip=" + slip
                + ", startDate=" + startDate + "]";
    }   // End of tellAboutSelf


}   // End of class Lease