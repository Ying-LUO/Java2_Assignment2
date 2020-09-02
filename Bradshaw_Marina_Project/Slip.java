package Bradshaw_Marina_Project;

public class Slip {

    public static final Slip EMPTY_SLIP = new Slip("EMPTY_SLIP", 0, 0);

    private String slipID;
    private int width;
    private double slipLength;

    private Dock dock;
    private Boat boat;

    public Slip(){
        this.slipID = "";
        this.width = 0;
        this.slipLength = 0;
    }

    public Slip(String slipID, int width, double slipLength) {
        this.slipID = slipID;
        this.width = width;
        this.slipLength = slipLength;
    }

    public double leaseSlip(){

        // assume slip fee type by width
        double fee;

        switch(this.width)
        {
            case 10: fee=800;break;
            case 12: fee=900;break;
            case 14: fee=1100;break;
            case 16: fee=1500;break;
            default: fee=0;break;
        }
        return fee;
    }

    public String getSlipID() {
        return slipID;
    }

    public void setSlipID(String slipID) {
        this.slipID = slipID;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getSlipLength() {
        return slipLength;
    }

    public void setSlipLength(double slipLength) {
        this.slipLength = slipLength;
    }

    public Dock getDock() {
        return dock;
    }

    public void setDock(Dock dock) {
        this.dock = dock;
    }

    public String tellAboutSelf() {
        return "[slipID=" + slipID + "\tslipLength=" + slipLength + "\tslipWidth="
                + width + "]";
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public void removeBoatFromSlip(Boat boat){
        this.boat = null;
        boat.setSlip(Slip.EMPTY_SLIP);
    }
}
