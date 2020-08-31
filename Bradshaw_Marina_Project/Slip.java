package Bradshaw_Marina_Project;

public class Slip {

    private int slipID;
    private int width;
    private double slipLength;

    private Dock dock;

    public Slip(){
        this.slipID = 0;
        this.width = 0;
        this.slipLength = 0;
    }

    public Slip(int slipID, int width, double slipLength) {
        this.slipID = slipID;
        this.width = width;
        this.slipLength = slipLength;
    }

    public double leaseSlip(double width){

        // assume three slip type by width: 12 / 14 / other, not check the invalid value input
        double fee;

        if (width == 12){
            fee = 800; 
        }else if(width == 14){
            fee = 1000;
        }else{
            fee = 600;
        }

        return fee;
    }

    public int getSlipID() {
        return slipID;
    }

    public void setSlipID(int slipID) {
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
        return "Slip [slipID=" + slipID + "\nslipLength=" + slipLength + "\nwidth="
                + width + "]";
    }

}