import java.util.Date;

public class AnnualLease extends Lease {

    private double payMonthly;
    private double balanceDue;

    public AnnualLease(double amount, Date startDate, Date endDate, double payMonthly, double balanceDue) {
        super(amount, startDate, endDate);
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
        // TODO Auto-generated method stub
        return 0;
    }


}