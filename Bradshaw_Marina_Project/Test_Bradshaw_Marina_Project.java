package Bradshaw_Marina_Project;

import java.util.*;
import java.io.*;

public class Test_Bradshaw_Marina_Project {

    public static void main(String[] args) throws FileNotFoundException{

        // Read data from input TXT file under the same directory of the class folder
        Scanner inFile_Customer = new Scanner( new FileReader("CustomerInfo.txt"));

        Scanner inFile_SailBoat = new Scanner( new FileReader("SailBoatInfo.txt"));

        Scanner inFile_PowerBoat = new Scanner( new FileReader("PowerBoatInfo.txt"));

        Scanner inFile_Slip = new Scanner( new FileReader("SlipInfo.txt"));

        Scanner inFile_Dock = new Scanner( new FileReader("DockInfo.txt"));

        
        // Write the updated data into output TXT under the same directory of the class folder, named as requested
        PrintWriter outFile_Lease = new PrintWriter("Lease.txt");

        PrintWriter outFile_Slip = new PrintWriter("Slip.txt");

        PrintWriter outFile_Boat = new PrintWriter("Boat.txt");


        // Initilize objects from data input
        // Instantiate Customer information
        ArrayList<Customer> customer_List = new ArrayList<Customer>();

        while(inFile_Customer.hasNext()){
            
            // Initialization
            Customer customer = new Customer();

            customer.setName(inFile_Customer.next());
            customer.setAddress(inFile_Customer.next());
            customer.setPhoneNo(inFile_Customer.next());

            // Process
            customer_List.add(customer);

        }

        // Display all information 
        System.out.println("\nFor Customer List");
        for (int i = 0; i < customer_List.size(); i++) { 		      
          System.out.println(customer_List.get(i).toString()); 		
        }

        // Instantiate SailBoat information
        ArrayList<Sailboat> sailBoat_List = new ArrayList<Sailboat>();

        while(inFile_SailBoat.hasNext()){
            
            // Initialization
            Sailboat sailBoat = new Sailboat();
            sailBoat.setStateRegistrationNO(inFile_SailBoat.next());
            sailBoat.setBoatLength(inFile_SailBoat.nextDouble());
            sailBoat.setManufacturer(inFile_SailBoat.next());
            sailBoat.setYear(inFile_SailBoat.nextInt());
            sailBoat.setKeelDedpth(inFile_SailBoat.nextDouble());
            sailBoat.setNumberSails(inFile_SailBoat.nextInt());
            sailBoat.setMotorType(MotorType.valueOf(inFile_SailBoat.next()));
            
            // Process
            sailBoat_List.add(sailBoat);

        }

        // Display all information 
        System.out.println("\nFor SailBoat List:");
        for (int i = 0; i < sailBoat_List.size(); i++) { 		      
          System.out.println(sailBoat_List.get(i).tellAboutSelf()); 		
        }


        // Instantiate PowerBoat information
        ArrayList<Powerboat> powerBoat_List = new ArrayList<Powerboat>();

        while(inFile_PowerBoat.hasNext()){
            
            // Initialization
            Powerboat powerBoat = new Powerboat();
            powerBoat.setStateRegistrationNO(inFile_PowerBoat.next());
            powerBoat.setBoatLength(inFile_PowerBoat.nextDouble());
            powerBoat.setManufacturer(inFile_PowerBoat.next());
            powerBoat.setYear(inFile_PowerBoat.nextInt());
            powerBoat.setNumberEngines(inFile_PowerBoat.nextInt());
            powerBoat.setFuelType(FuelType.valueOf(inFile_PowerBoat.next()));
            
            // Process
            powerBoat_List.add(powerBoat);

        }

        // Display all information 
        System.out.println("\nFor PowerBoat List:");
        for (int i = 0; i < powerBoat_List.size(); i++) { 		      
          System.out.println(powerBoat_List.get(i).tellAboutSelf()); 		
        }


        // Instantiate Dock information
        ArrayList<Dock> dock_List = new ArrayList<Dock>();

        while(inFile_Dock.hasNext()){
            
            // Initialization
            Dock dock = new Dock();
            dock.setDockID(inFile_Dock.next());
            dock.setLocation(inFile_Dock.next());
            dock.setElectricity(Boolean.parseBoolean(inFile_Dock.next()));
            dock.setWater(Boolean.parseBoolean(inFile_Dock.next()));
            
            // Process
            dock_List.add(dock);

        }

        // Display all information 
        System.out.println("\nFor Dock List:");
        for (int i = 0; i < dock_List.size(); i++) { 		      
          System.out.println(dock_List.get(i).toString()); 		
        }


        // Instantiate Slip information
        ArrayList<Slip> slip_List = new ArrayList<Slip>();

        while(inFile_Slip.hasNext()){
            
            // Initialization
            Slip slip = new Slip();
            slip.setSlipID(inFile_Slip.next());
            slip.setWidth(inFile_Slip.nextInt());
            slip.setSlipLength(inFile_Slip.nextDouble());

            // Process
            slip_List.add(slip);

        }

        // Display all information 
        System.out.println("\nFor Slip List:");
        for (int i = 0; i < slip_List.size(); i++) { 		      
          System.out.println(slip_List.get(i).tellAboutSelf()); 		
        }

        // Add first three Slips to Dock one
        dock_List.get(0).addSlipToDock(slip_List.get(0));
        dock_List.get(0).addSlipToDock(slip_List.get(1));
        dock_List.get(0).addSlipToDock(slip_List.get(2));

        // Add last three Slips to Dock two
        dock_List.get(1).addSlipToDock(slip_List.get(3));
        dock_List.get(1).addSlipToDock(slip_List.get(4));
        dock_List.get(1).addSlipToDock(slip_List.get(5));

        // Add boat to Slip
        sailBoat_List.get(0).assignBoatToCustomer(customer_List.get(0));
        sailBoat_List.get(1).assignBoatToCustomer(customer_List.get(1));
        powerBoat_List.get(0).assignBoatToCustomer(customer_List.get(0));
        powerBoat_List.get(1).assignBoatToCustomer(customer_List.get(1));

        // Output Slip Information to text file
        for (int i = 0; i < dock_List.size(); i++) { 	

            outFile_Slip.printf("%n%s has the following slips: %n", dock_List.get(i).toString());

            for(int j = 0; j < dock_List.get(i).getSlipList().size(); j++)	   {

                outFile_Slip.printf("%n%s", dock_List.get(i).getSlipList().get(j).tellAboutSelf());

            }   
            	
          }

        for(int i=0; i<customer_List.size(); i++){
            outFile_Boat.printf("%n%s has %n%s", customer_List.get(i).toString(), customer_List.get(i).getBoat().tellAboutSelf());
        }
        
        // Test Scenario One: Lease Annual Slip to existing Customer

        //Lease lease_01 = new Lease();
        



        // Closure of files
        inFile_Customer.close();
        inFile_SailBoat.close();
        inFile_PowerBoat.close();
        inFile_Slip.close();
        inFile_Dock.close();

        outFile_Lease.close();
        outFile_Slip.close();
        outFile_Boat.close();

    }
    
}