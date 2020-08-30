package Bradshaw_Marina_Project;

import java.util.Date;

public class AnnualLease extends Lease {

    private double payMonthly; // lease fee per month
    private double balanceDue;

    public AnnualLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip, double payMonthly, double balanceDue) {
        super(amount, startDate, endDate, customer, slip);
        this.payMonthly = payMonthly;
        this.balanceDue = balanceDue;
    }

    public double getPayMonthly() {
        return payMonthly;
    }

    public void setPayMonthly(double payMonthly) {
        this.payMonthly = payMonthly;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }

    @Override
    public double calculateFee() {
        return 
    }


}