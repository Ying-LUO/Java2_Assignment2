package Bradshaw_Marina_Project;

import java.time.LocalDate;

public abstract class Lease {

    private double amount; //lease fee
    private LocalDate startDate;
    private LocalDate endDate;

    private Customer customer;
    private Slip slip;

    // Only provide the parameter constructor
    public Lease(LocalDate startDate, LocalDate endDate, Customer customer, Slip slip) {
        this.amount = 0;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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

    public abstract double calculateFee(int width);

    public String tellAboutSelf() {
        return "amount=" + amount + "\n\tcustomer=" + customer +
                "\n\tstartDate=" + startDate + "\n\tendDate=" + endDate +
                "\n\tslip=" + slip.tellAboutSelf() + "\n";
    }

}
