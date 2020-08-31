package Bradshaw_Marina_Project;

import java.util.Date;

public class DailyLease extends Lease {

    private int numberOfDays;

    public DailyLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip) {
        super(amount, startDate, endDate, customer, slip);
        this.numberOfDays = (int)(startDate.getTime() - endDate.getTime());
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateFee(int width) {
        double fee;

        if (width == 12){
            fee = 30 * getNumberOfDays(); 
        }else if(width == 14){
            fee = 35 * getNumberOfDays();
        }else{
            fee = 25 * getNumberOfDays();
        }

        return fee; 
    }
    
    @Override
    public String tellAboutSelf(){
        return super.tellAboutSelf() + "\n\tDailyLease [numberOfDays=" + numberOfDays + "]";

    }
    
}