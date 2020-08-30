package Bradshaw_Marina_Project;

import java.util.ArrayList;

public class Dock {

    public int dockID;
    public String location;
    public Boolean electricity;
    public Boolean water;

    private ArrayList<Slip> slipList;

    public Dock(){
        this.dockID = 0;
        this.location = "";
        this.electricity = true;
        this.water = true;
        this.slipList = new ArrayList<Slip>();
    }

    public Dock(int dockID, String location, Boolean electricity, Boolean water) {
        this.dockID = dockID;
        this.location = location;
        this.electricity = electricity;
        this.water = water;
        this.slipList = new ArrayList<Slip>();
    }
    
    public boolean addSlipToDock(Slip slip){

        if (slip == null || slipList.contains(slip)) {
            return false;
        }
        slipList.add(slip);
        return true;

    }


}