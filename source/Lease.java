import java.util.Date;

public abstract class Lease {

    private double amount;
    private Date startDate;
    private Date endDate;

    public Lease(double amount, Date startDate, Date endDate) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public abstract double calculateFee();

}