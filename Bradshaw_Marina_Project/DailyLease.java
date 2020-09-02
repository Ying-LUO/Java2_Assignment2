package Bradshaw_Marina_Project;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DailyLease extends Lease{

    private int numberOfDays;

    public DailyLease(LocalDate startDate, LocalDate endDate, Customer customer, Slip slip) {
        super(startDate, endDate, customer, slip);
        this.numberOfDays = (int)(ChronoUnit.DAYS.between(getStartDate(), getEndDate()));
        this.setAmount(calculateFee(slip.getWidth()));
    }

    // there is no set method for numberOfDays because it was calculated by startDate and endDate
    public int getNumberOfDays() {
        return numberOfDays;
    }

    @Override
    public double calculateFee(int width) {
        double fee;
        switch(width)
        {
            case 10:fee=20*getNumberOfDays();break;
            case 12:fee=25*getNumberOfDays();break;
            case 14:fee=30*getNumberOfDays();break;
            case 16:fee=35*getNumberOfDays();break;
            default:fee=0;
        }
        return fee;
    }

    @Override
    public String tellAboutSelf(){
        return "\tDailyLease [numberOfDays=" + numberOfDays + ", " + super.tellAboutSelf() + "\n";

    }
}
