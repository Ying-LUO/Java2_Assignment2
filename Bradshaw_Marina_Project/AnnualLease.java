package Bradshaw_Marina_Project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class AnnualLease extends Lease{
    private boolean isPayMonthly;
    private double balanceDue;
    // calculate months from start date to current date
    private int months_paid = (int)(ChronoUnit.MONTHS.between(getStartDate().withDayOfMonth(1), LocalDate.now().withDayOfMonth(1)));

    public AnnualLease(LocalDate startDate, LocalDate endDate, Customer customer, Slip slip, boolean isPayMonthly) {
        super(startDate, endDate, customer, slip);
        this.isPayMonthly = isPayMonthly;
        this.setAmount(slip.leaseSlip());
    }

    public boolean isPayMonthly() {
        return isPayMonthly;
    }

    public void setPayMonthly(boolean isPayMonthly) {
        this.isPayMonthly = isPayMonthly;
    }

    public double getBalanceDue() {

        // if pay by month, then balance due equal to total amount minus months_paid multiply the montly_payment
        // if not pay by month, the balance due equal to zero since all the balance should be paid at the beginning of the lease
        if(isPayMonthly)
            setBalanceDue(getAmount()-getAmount()/12*months_paid);
        else	setBalanceDue(0);

        return balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }


    public int getMonths_paid() {
        return months_paid;
    }

    @Override
    public double calculateFee(int width) {
        double fee;

        switch(width)
        {
            case 10: fee=800;break;
            case 12: fee=900;break;
            case 14: fee=1100;break;
            case 16: fee=1500;break;
            default: fee=0;break;
        }

        return fee;
    }

    public String tellAboutSelf(){
        return "\tAnnualLease [balanceDue=" + getBalanceDue() + ", isPayMonthly=" + isPayMonthly()
                + ", hasPaid months=" + getMonths_paid() + ", " + super.tellAboutSelf() + "\n";
    }

}
