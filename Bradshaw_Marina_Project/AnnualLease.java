package Bradshaw_Marina_Project;

import java.util.Date;

public class AnnualLease extends Lease {

    private boolean isPayMonthly; 
    private double balanceDue;

    public AnnualLease(double amount, Date startDate, Date endDate, Customer customer, Slip slip, boolean payMonthly, double balanceDue) {
        super(amount, startDate, endDate, customer, slip);
        setPayMonthly(isPayMonthly);

        if(payMonthly){
            setBalanceDue(getAmount() - getAmount()/12);
        }else{
            setBalanceDue(0);
        }
    }

    public boolean isPayMonthly() {
        return isPayMonthly;
    }

    public void setPayMonthly(boolean isPayMonthly) {
        this.isPayMonthly = isPayMonthly;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(double balanceDue) {
        this.balanceDue = balanceDue;
    }

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
    }

    public String tellAboutSelf(){
        return super.tellAboutSelf() + "\n\tAnnualLease [balanceDue=" + balanceDue + ", isPayMonthly=" + isPayMonthly + "]";

    }

}