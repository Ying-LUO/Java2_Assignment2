public class Rowboat extends Boat{

    public String[] typeOfMaterial;
    public String[] oarType;

    public Rowboat(String stateRegistrationNO, double boatLength, String manufactor, int year) {
        super(stateRegistrationNO, boatLength, manufactor, year);
        // TODO Auto-generated constructor stub
    }

    public String[] getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String[] typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public String[] getOarType() {
        return oarType;
    }

    public void setOarType(String[] oarType) {
        this.oarType = oarType;
    }

    @Override
    public void assignBoatToSlip() {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeBoatFromSlip() {
        // TODO Auto-generated method stub

    }

    @Override
    public String tellAboutSelf() {
        // TODO Auto-generated method stub
        return null;
    }

    
}