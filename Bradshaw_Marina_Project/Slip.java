package Bradshaw_Marina_Project;

import java.util.ArrayList;
import java.util.Date;

public class Slip {

    public int slipID;
    public double width;
    public double slipLength;

    public ArrayList<Boat> boatList;
    public ArrayList<Customer> customerList;

    public Slip(){
        this.slipID = 0;
        this.width = 0;
        this.slipLength = 0;
        this.boatList = new ArrayList<Boat>();
        this.customerList = new ArrayList<Customer>();
    }

    public Slip(int slipID, double width, double slipLength, Boat boat, Customer customer) {
        this.slipID = slipID;
        this.width = width;
        this.slipLength = slipLength;
        this.boatList = new ArrayList<Boat>();;
        this.customerList = new ArrayList<Customer>();
    }

    public Lease leaseSlip(Boat boat, Customer customer){
        
        this.boatList.add(boat);
        this.customerList.add(customer);
        
    }

    public Lease leaseSlip(Boat boat, Date startDate){
        
        return new Lease();
        
    }



}