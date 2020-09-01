// AnnualLease.java
/** The declaration package of class AnnualLease
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package 
package Bradshaw_Marina_Project;

import java.util.Date;

// The declaration of the class AnnualLease
public class AnnualLease extends Lease {

    // The declaration of Data members 
    private boolean isPayMonthly;                       // To store whether is lease fee is paid monthly
    private double balanceDue;                          // To store the balancedue infomation
    
    // The declaration of methods
    // The parameterized constructor
    public AnnualLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip, boolean payMonthly, double balanceDue) {
        // initialize the data members with parameters        
        super(amount, startDate, endDate, customer, slip);
        setPayMonthly(isPayMonthly);

        if(payMonthly){
            setBalanceDue(getAmount() - getAmount()/12);
        }else{
            setBalanceDue(0);
        }
    }   // End of AnnualLease

    // The isPayMonthly method, return isPayMonthly's value.
    public boolean isPayMonthly() {
        return isPayMonthly;
    }   // End of isPayMonthly

    // The setPayMonthly method, set isPayMonthly's value.
    public void setPayMonthly(boolean isPayMonthly) {
        this.isPayMonthly = isPayMonthly;
    }   // End of setPayMonthly

    // The getBalanceDue method, return balanceDue information.
    public double getBalanceDue() {
        return balanceDue;
    }   // End of getBalanceDue
    
    // The setBalanceDue method, set balanceDue's value.
    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }   // End of setBalanceDue

    // The calculateFee method, return the lease fee according to the slip width
    @Override
    public double calculateFee(int width) {
        double fee;

        if (width == 12){
            fee = 800; 
        }else if(width == 14){
            fee = 1000;
        }else{
            fee = 600;
        }

        return fee; 
    }   // End of calculateFee

    // The tellAboutSelf method, return all data members' information within a String.
    public String tellAboutSelf(){
        return super.tellAboutSelf() + "\n\tAnnualLease [balanceDue=" + balanceDue + ", isPayMonthly=" + isPayMonthly + "]";

    }   // End of tellAboutSelf

}   // End of class AnnualLease