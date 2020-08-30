package Bradshaw_Marina_Project;

public class CoveredSlip extends Slip{

    public double height;
    public boolean door;
    
    public CoveredSlip() {
        super();
        this.height = 0;
        this.door = true;
    }

    public CoveredSlip(int slipID, double width, double slipLength, double height, boolean door) {
        super(slipID, width, slipLength);
        this.height = height;
        this.door = door;
    }

    
    
}