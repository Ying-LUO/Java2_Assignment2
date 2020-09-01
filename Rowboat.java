// Rowboat.java
/** The declaration package of class Rowboat
  * Including the declaration of data members and constructors, accesors, tellAboutSelf methods.
  * @author Ying Luo, Yueming Ling, TingTing Song, ChunMei Liu, Wei Wu, JianDong Han 
  * version 1.0
  * @since 2020-09-01
*/

// Declare the package
package Bradshaw_Marina_Project;

// The declaration of the class Rowboat
public class Rowboat extends Boat{

    // The declaration of Data members 
    public MaterialType typeOfMaterial;                     // To store the material type information
    public OarType oarType;                                 // To store the oartype information
    
    // The declaration of methods
    // Default constructor
    public Rowboat(){
        // initialize the data members        
        super();
        this.typeOfMaterial = MaterialType.Aluminum;
        this.oarType = OarType.Sculling_Oars;
    }   // End of Rowboat
    
    // The parameterized constructor
    public Rowboat(String stateRegistrationNO, double boatLength, String manufacturer, int year,
            MaterialType typeOfMaterial, OarType oarType) {
        // initialize the data members with parameters
        super(stateRegistrationNO, boatLength, manufacturer, year);
        this.typeOfMaterial = typeOfMaterial;
        this.oarType = oarType;
    }   // End of Rowboat

    // The getTypeOfMaterial method, return typeOfMaterial information.    
    public MaterialType getTypeOfMaterial() {
        return typeOfMaterial;
    }   // End of getTypeOfMaterial

    // The setTypeOfMaterial method, set typeOfMaterial's value.
    public void setTypeOfMaterial(MaterialType typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }   // End of setTypeOfMaterial
    
    // The getOarType method, return oarType information.
    public OarType getOarType() {
        return oarType;
    }   // End of getOarType
    
    // The setOarType method, set oarType's value.
    public void setOarType(OarType oarType) {
        this.oarType = oarType;
    }   // End of setOarType
    
    // The tellAboutSelf method, return all data members' information within a String.
    @Override
    public String tellAboutSelf() {
        return super.tellAboutSelf() + "Rowboat \n[typeOfMaterial=" + typeOfMaterial + 
        "\noarType=" + oarType + "]";
    }   // End of tellAboutSelf


    
}   // End of class Rowboat