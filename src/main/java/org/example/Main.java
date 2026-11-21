
package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

/**
  *Main class to run the device registry application.
 */

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
/* option user can choose */

        int option = 0;
        InMemoryDeviceRepository OR=new InMemoryDeviceRepository();


        while (option!=4) {



            System.out.println("Enter the option you want :");
            System.out.println("1. Add device.");
            System.out.println("2. Show all devices list.");
            System.out.println("3. Search for device.");
            System.out.println("4. Exit.");
            try{
            option = in.nextInt();
            in.nextLine();


                // Add Device

                if (option == 1) {

                    String result;
                    Device d = new Device();
                    DeviceService obj1 = new DeviceService(OR);

                    System.out.print("Enter the name: ");
                    d.setName(in.nextLine());

                    System.out.print("Enter the Type (RFID, IO, CAMERA): ");
                    d.setType(in.nextLine());

                    System.out.print("Enter the ID: ");
                    d.setID(in.nextLine());

                    do {

                        result = obj1.CheackAll(d.getID(),d.getName(), d.getType());

                        if (result.equals("EMPTY_NAME")) {

                            System.out.println("Name cannot be empty!");
                            System.out.print("Enter the name again: ");
                            d.setName(in.nextLine());

                        }

                        else if (result.equals("EMPTY_TYPE")) {

                            System.out.println("Type cannot be empty!");
                            System.out.print("Enter the Type again: ");
                            d.setType(in.nextLine());

                        }

                        else if (result.equals("INVALID_TYPE")) {

                            System.out.println("Invalid type! Please enter RFID, IO, or CAMERA.");
                            System.out.print("Enter the Type again: ");
                            d.setType(in.nextLine());

                        }

                        else if (result.equals("EMPTY_ID")) {

                            System.out.println("ID cannot be empty!");
                            System.out.print("Enter the ID again: ");
                            d.setID(in.nextLine());

                        }

                        else if (result.equals("EXIST_ID")) {

                            System.out.println("This ID already exists! Please enter another ID.");
                            System.out.print("Enter the ID again: ");
                            d.setID(in.nextLine());

                        }

                    } while (!result.equals("Done"));

                    obj1.registerDevice(d);

                    System.out.println("Device registered successfully!");
                }

            //Show All Devices
            else if (option == 2) {

             ArrayList<Device> d=OR.Listing();
                    if (d.isEmpty()) {
                        System.out.println("There are no devices in the list.");
                    } else {

                for (int i=0;i<d.size();i++) {
                    System.out.println("Device number " + (i + 1));
                    System.out.println("Name is :" + d.get(i).getName());

                    System.out.println("Type is :" + d.get(i).getType());

                    System.out.println("ID is :" + d.get(i).getID());
                }
                }

                //Search
            }
            else if (option == 3) {

                System.out.println("Search for device you want by name or id ");
                String sch=in.nextLine();
                sch = sch.trim();
                if(OR.Listing().isEmpty()) {
                    System.out.println("There is no device in the list");
                    break ;
                }

                while (sch.isEmpty()) {

                    System.out.println("Please enter valid value! the field is empty .");
                    System.out.print("Enter the the value: ");
                    sch = in.nextLine();
                    sch = sch.trim();
                }
                Device result = OR.search(sch);
                if(result == null){
                    System.out.println("No Device found");

                }
                else{
                    System.out.println("name: " + result.getName());
                    System.out.println("type: " + result.getType());
                    System.out.println("id: " + result.getID());
                }

            }
            //Exit
            else if (option ==4) {
                System.out.println("You choose exit option");
            }


            else {
                System.out.println("Please Enter valid option .");
            }
        }
            /*if user enter invalid value */
             catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                in.nextLine();
            }

        }





    }
}