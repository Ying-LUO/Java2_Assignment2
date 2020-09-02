package Bradshaw_Marina_Project;

import java.time.LocalDate;
import java.time.ZonedDateTime;
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

        PrintWriter outFile_Slip = new PrintWriter("Dock_Has_Slip.txt");

        PrintWriter outFile_Boat = new PrintWriter("Customer_Has_Boat.txt");


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

        // Instantiate Boat information
        ArrayList<Boat> boat_List = new ArrayList<Boat>();

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
            boat_List.add(sailBoat);

        }

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
            boat_List.add(powerBoat);

        }

        // Display all boat information
        System.out.println("\nFor Boat List:");
        for (int i = 0; i < boat_List.size(); i++) {
            System.out.println(boat_List.get(i).tellAboutSelf());
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

        // Add Boat to Customer
        customer_List.get(0).addBoatToCustomer(boat_List.get(0));
        customer_List.get(0).addBoatToCustomer(boat_List.get(1));
        customer_List.get(1).addBoatToCustomer(boat_List.get(2));
        customer_List.get(1).addBoatToCustomer(boat_List.get(3));

        // Output Dock and Slip Information to text file
        for (int i = 0; i < dock_List.size(); i++) {

            outFile_Slip.printf("%n%s has the following slips: %n", dock_List.get(i).toString());

            for(int j = 0; j < dock_List.get(i).getSlipArrayList().size(); j++)	   {

                outFile_Slip.printf("%n%s", dock_List.get(i).getSlipArrayList().get(j).tellAboutSelf());

            }

        }


        // Test Scenario One: Lease Annual Slip to existing Customer who just buy a new boat
        ArrayList<Lease> lease_List = new ArrayList<Lease>();

        AnnualLease annualLease_01 = new AnnualLease(LocalDate.of( 2020 , 3 , 30 ),
                                                    LocalDate.of( 2021 , 3 , 30 ),
                                                    customer_List.get(3),
                                                    slip_List.get(4),
                                                    true);

        // Existing Customer has a new Boat of subclass
        PersonalWatercraft new_WaterCraft = new PersonalWatercraft("RegNo_08_PWC_0731",
                                                                    10.5,
                                                                    "Manufacturer_12",
                                                                    2010,
                                                                    2,
                                                                    FuelType.MDO_marine_diesel_oil,
                                                                    8,
                                                                    400);
        // put this new boat into exiting boat list
        boat_List.add(new_WaterCraft);

        // assign this new boat to the existing customer of this lease
        annualLease_01.getCustomer().addBoatToCustomer(new_WaterCraft);

        // assign this new boat of the existing customer to the leased slip
        new_WaterCraft.setSlip(annualLease_01.getSlip());

        // add this new lease into arraylist for report
        lease_List.add(annualLease_01);

        // Display all information
        System.out.printf("%nTest Case 01:%n%s %nlease %s for %n%s %ninformation as below%n%s%n",
                            annualLease_01.getCustomer(),
                            annualLease_01.getSlip().tellAboutSelf(),
                            // new added boat of that customer, call by customer's boat arraylist
                            // or call by newboat directly, like new_WaterCraft.tellAboutSelf()
                            annualLease_01.getCustomer().getBoatArrayList().get(annualLease_01.getCustomer().getBoatArrayList().size()-1).tellAboutSelf(),
                            annualLease_01.tellAboutSelf());



        // Test Scenario Two: Lease Annual Slip to new Customer who just buy a new boat
        Customer new_Customer = new Customer("new_test_customer", "new_test_address_country_post_code", "514-438-0011");
        // Add new customer and new boat into existing list
        customer_List.add(new_Customer);

        // Create new annual lease for this customer
        AnnualLease annualLease_02 = new AnnualLease(LocalDate.now(),
                                                    LocalDate.now().plusYears(1), // automatically add one year from current date
                                                    new_Customer,
                                                    slip_List.get(5),
                                                    false); // Assume all the amount of lease has been paid at the beginning of the lease

        // New Customer has a new Boat of subclass
        CruisingSailboat new_CruisingSailBoat = new CruisingSailboat("RegNo_02_CSB_010",
                                                                    6.8,
                                                                    "Manufacturer_92",
                                                                    2000,
                                                                    27.5,
                                                                    2,
                                                                    MotorType.Inboard,
                                                                    "LifRaft");
        // Add new new boat into existing list
        boat_List.add(new_CruisingSailBoat);

        // Assign new boat to new customer
        new_Customer.addBoatToCustomer(new_CruisingSailBoat);

        // assign this new boat of the customer to the leased slip
        new_CruisingSailBoat.setSlip(annualLease_02.getSlip());

        // add this new lease into arraylist for report
        lease_List.add(annualLease_02);

        // Display all information
        System.out.printf("%nTest Case 02:%n%s %nlease %s for %n%s %ninformation as below%n%s%n",
                        annualLease_02.getCustomer(),
                        annualLease_02.getSlip().tellAboutSelf(),
                        // new added boat of that customer, call by customer's boat arraylist
                        // or call by newboat directly, like new_WaterCraft.tellAboutSelf()
                        annualLease_02.getCustomer().getBoatArrayList().get(annualLease_01.getCustomer().getBoatArrayList().size()-1).tellAboutSelf(),
                        annualLease_02.tellAboutSelf());


        // Test Scenario Three: Lease Daily Slip to existing Customer who has boat already
        DailyLease dailyLease_01 = new DailyLease(LocalDate.of( 2020 , 8 , 30 ),
                                                LocalDate.of( 2020 , 10 , 30 ),
                                                customer_List.get(1),
                                                slip_List.get(2));

        // Existing customer has a existing boat, just assign this boat to the leased slip
        dailyLease_01.getCustomer().getBoatArrayList().get(1).setSlip(dailyLease_01.getSlip());

        // add this new lease into arraylist for report
        lease_List.add(dailyLease_01);

        // Display all information
        System.out.printf("%nTest Case 03:%n%s %nlease %s for %n%s %ninformation as below%n%s%n",
                dailyLease_01.getCustomer(),
                dailyLease_01.getSlip().tellAboutSelf(),
                dailyLease_01.getCustomer().getBoatArrayList().get(1).tellAboutSelf(),
                dailyLease_01.tellAboutSelf());


        // Test Scenario Four: Lease Daily Slip to new Customer who just buy a new boat
        Customer new_Customer_02 = new Customer("new_test_customer_02", "new_test_address_country_post_code_02", "514-438-0022");

        // Add new customer into existing list
        customer_List.add(new_Customer_02);

        // Create new daily lease for this customer
        DailyLease dailyLease_02 = new DailyLease(LocalDate.now(),
                                                    LocalDate.now().plusDays(100),
                                                    new_Customer_02,
                                                    slip_List.get(3));

        // New Customer has a new Boat of subclass
        Rowboat new_RowBoat = new Rowboat("RegNo_02_RB_CAN_1007",
                                            9.17,
                                            "Manufacturer_51",
                                            2010,
                                            MaterialType.GRP_Glass_Reinforced_Plastic,
                                            OarType.Sculling_Oars);
        // Add new new boat into existing list
        boat_List.add(new_RowBoat);

        // Assign new boat to new customer
        new_Customer_02.addBoatToCustomer(new_RowBoat);

        // assign this new boat of the customer to the leased slip
        new_CruisingSailBoat.setSlip(dailyLease_02.getSlip());

        // add this new lease into arraylist for report
        lease_List.add(dailyLease_02);

        // Display all information
        System.out.printf("%nTest Case 04:%n%s %nlease %s for %n%s %ninformation as below%n%s%n",
                dailyLease_02.getCustomer(),
                dailyLease_02.getSlip().tellAboutSelf(),
                dailyLease_02.getCustomer().getBoatArrayList().get(0).tellAboutSelf(),
                dailyLease_02.tellAboutSelf());

        // Output Lease Information to text file
        outFile_Lease.printf("%nBradshaw Marina Company has the following slips: %nUp to date of %tA %<tB  %<te,  %<tY%n", ZonedDateTime.now());
        for (int i = 0; i < lease_List.size(); i++) {

            outFile_Lease.printf("Lease: 0000%d%n%s%n", (i+1),
                                lease_List.get(i).tellAboutSelf());

        }

        // Output Customer and Boat Information to text file
        for (int i = 0; i < customer_List.size(); i++) {

            outFile_Boat.printf("%n%s has the following boats: %n", customer_List.get(i).toString());

            for(int j = 0; j < customer_List.get(i).getBoatArrayList().size(); j++)	   {

                outFile_Boat.printf("%n%s", customer_List.get(i).getBoatArrayList().get(j).tellAboutSelf());

            }

        }

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