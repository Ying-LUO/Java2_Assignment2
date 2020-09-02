package Bradshaw_Marina_Project;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String address;
    private String phoneNo;

    private ArrayList<Boat> boatArrayList;

    public Customer(){
        this.name = "";
        this.address = "";
        this.phoneNo = "";
        this.boatArrayList = new ArrayList<Boat>();
    }

    public Customer(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.boatArrayList = new ArrayList<Boat>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public ArrayList<Boat> getBoatArrayList() {
        return boatArrayList;
    }

    public void setBoatArrayList(ArrayList<Boat> boatArrayList) {
        this.boatArrayList = boatArrayList;
    }

    public boolean addBoatToCustomer(Boat boat){

        if (boat == null || boatArrayList.contains(boat)) {
            return false;
        }
        boatArrayList.add(boat);
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

}
