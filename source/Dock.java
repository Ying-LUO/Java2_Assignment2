import java.util.ArrayList;

public class Dock {

    public Long dockID;
    public String location;
    public Boolean electricity;
    public Boolean water;

    private ArrayList<Slip> slipList;

    public Dock(Long dockID, String location, Boolean electricity, Boolean water) {
        this.dockID = dockID;
        this.location = location;
        this.electricity = electricity;
        this.water = water;
        this.slipList = new ArrayList<Slip>();
    }
    
    public boolean addSlipToDock(Slip aSlip){

        if (aSlip == null || slipList.contains(aSlip)) {
            return false;
        }
        slipList.add(aSlip);
        return true;

    }


}