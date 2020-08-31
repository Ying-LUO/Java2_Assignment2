package Bradshaw_Marina_Project;

public class Rowboat extends Boat{

    public MaterialType typeOfMaterial;
    public OarType oarType;

    public Rowboat(){
        super();
        this.typeOfMaterial = MaterialType.Aluminum;
        this.oarType = OarType.Sculling_Oars;
    }

    public Rowboat(String stateRegistrationNO, double boatLength, String manufacturer, int year,
            MaterialType typeOfMaterial, OarType oarType) {
        super(stateRegistrationNO, boatLength, manufacturer, year);
        this.typeOfMaterial = typeOfMaterial;
        this.oarType = oarType;
    }
    
    public MaterialType getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(MaterialType typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    public OarType getOarType() {
        return oarType;
    }

    public void setOarType(OarType oarType) {
        this.oarType = oarType;
    }

    @Override
    public String tellAboutSelf() {
        return super.tellAboutSelf() + "Rowboat \n[typeOfMaterial=" + typeOfMaterial + 
        "\noarType=" + oarType + "]";
    }


    
}