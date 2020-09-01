package Bradshaw_Marina_Project;

import java.util.ArrayList;

public class Dock {

    private String dockID;
    private String location;
    private Boolean electricity;
    private Boolean water;

    private ArrayList<Slip> slipList;

    public Dock(){
        this.dockID = "";
        this.location = "";
        this.electricity = true;
        this.water = true;
        this.slipList = new ArrayList<Slip>();
    }

    public Dock(String dockID, String location, Boolean electricity, Boolean water) {
        this.dockID = dockID;
        this.location = location;
        this.electricity = electricity;
        this.water = water;
        this.slipList = new ArrayList<Slip>();
    }

    public String getDockID() {
        return dockID;
    }

    public void setDockID(String dockID) {
        this.dockID = dockID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(Boolean electricity) {
        this.electricity = electricity;
    }

    public Boolean getWater() {
        return water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public boolean addSlipToDock(Slip slip){

        if (slip == null || slipList.contains(slip)) {
            return false;
        }
        slipList.add(slip);
        return true;

    }

    @Override
    public String toString() {
        return "Dock [dockID=" + dockID + ", electricity=" + electricity + ", location=" + location + ", water=" + water
                + "]";
    }

    public ArrayList<Slip> getSlipList() {
        return slipList;
    }

    public void setSlipList(ArrayList<Slip> slipList) {
        this.slipList = slipList;
    }

    
    
}