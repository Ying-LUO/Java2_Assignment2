package Bradshaw_Marina_Project;

import java.util.ArrayList;

public class Dock {

    private String dockID;
    private String location;
    private Boolean electricity;
    private Boolean water;

    private ArrayList<Slip> slipArrayList;

    public Dock(){
        this.dockID = "";
        this.location = "";
        this.electricity = true;
        this.water = true;
        this.slipArrayList = new ArrayList<Slip>();
    }

    public Dock(String dockID, String location, Boolean electricity, Boolean water) {
        this.dockID = dockID;
        this.location = location;
        this.electricity = electricity;
        this.water = water;
        this.slipArrayList = new ArrayList<Slip>();
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

        if (slip == null || slipArrayList.contains(slip)) {
            return false;
        }
        slipArrayList.add(slip);
        return true;

    }

    @Override
    public String toString() {
        return "Dock [dockID=" + dockID + ", electricity=" + electricity + ", location=" + location + ", water=" + water
                + "]";
    }

    public ArrayList<Slip> getSlipArrayList() {
        return slipArrayList;
    }

    public void setSlipArrayList(ArrayList<Slip> slipArrayList) {
        this.slipArrayList = slipArrayList;
    }

}
