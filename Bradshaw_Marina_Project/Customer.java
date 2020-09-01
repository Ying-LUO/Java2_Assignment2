package Bradshaw_Marina_Project;

public class Customer {

    private String name;
    private String address;
    private String phoneNo;

    private Boat boat;

    public Customer(){
        this.name = "";
        this.address = "";
        this.phoneNo = "";
    }

    public Customer(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
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

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Customer [address=" + address + ", boat=" + boat + ", name=" + name + ", phoneNo=" + phoneNo + "]";
    }


}