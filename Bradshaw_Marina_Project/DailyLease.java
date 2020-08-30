package Bradshaw_Marina_Project;

import java.util.Date;

public class DailyLease extends Lease {

    private int numberOfDays;

    public DailyLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip, int numberOfDays) {
        super(amount, startDate, endDate, customer, slip);
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateFee() {
        return this.numberOfDays * this.getAmount();
    }
    
    
}