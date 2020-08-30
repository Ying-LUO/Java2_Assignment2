package Bradshaw_Marina_Project;

import java.util.Date;

public abstract class Lease {

    private double amount; //lease fee per day;
    private Date startDate;
    private Date endDate;

    private Customer customer;
    private Slip slip;

    public Lease(double amount, Date startDate, Date endDate, Customer customer, Slip slip) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.slip = slip;
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
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Slip getSlip() {
        return slip;
    }

    public void setSlip(Slip slip) {
        this.slip = slip;
    }

    public abstract double calculateFee();

}