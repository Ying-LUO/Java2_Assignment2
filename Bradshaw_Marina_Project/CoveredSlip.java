package Bradshaw_Marina_Project;

public class CoveredSlip extends Slip{

    private double height;
    private boolean door;

    public CoveredSlip() {
        super();
        this.height = 0;
        this.door = true;
    }

    public CoveredSlip(String slipID, int width, double slipLength, double height, boolean door) {
        super(slipID, width, slipLength);
        this.height = height;
        this.door = door;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }
}
