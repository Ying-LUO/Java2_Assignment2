// DailyLease.java
/** The declaration package of class DailyLease
  * Including the declaration of data members and constructors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

import java.util.Date;

// The declaration of the class DailyLease
public class DailyLease extends Lease {

    // The declaration of Data members 
    private int numberOfDays;                       // To store the number of days info

    // The parameterized constructor
    public DailyLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip) {
        // initialize the data members with parameters
        super(amount, startDate, endDate, customer, slip);
        this.numberOfDays = (int)(startDate.getTime() - endDate.getTime());
    }   // End of DailyLease

    // The getNumberOfDays method, return numberOfDays information.
    public int getNumberOfDays() {
        return numberOfDays;
    }   // End of getNumberOfDays

    // The setNumberOfDays method, set numberOfDays's value.
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }   // End of setNumberOfDays

    // The calculateFee method, calculate and return the lease fee according to the slip's width.
    @Override
    public double calculateFee(int width) {
        double fee;

        if (width == 12){
            fee = 30 * getNumberOfDays(); 
        }else if(width == 14){
            fee = 35 * getNumberOfDays();
        }else{
            fee = 25 * getNumberOfDays();
        }   // End of else

        return fee; 
    }   // End of calculateFee

    // The tellAboutSelf method, return all data members' information within a String..    
    @Override
    public String tellAboutSelf(){
        return super.tellAboutSelf() + "\n\tDailyLease [numberOfDays=" + numberOfDays + "]";

    }   // End of tellAboutSelf
    
}   // End of class DailyLease