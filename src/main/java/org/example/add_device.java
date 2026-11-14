
package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *Class to Add new device.
 */

public class add_device {



    public String name,type,ID;

/* constructor*/
    public add_device(){
     this.name="null";
     this.type="null";
     this.ID="null";


    }
/*add device methode*/
    public void add(ArrayList<add_device> listd){

/* add device name*/
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name");
        name = in.nextLine();
        name = name.trim();
        // Check if the name is empty
        while (name.equals("")) {

            System.out.println("Please enter the name correctly the field is empty .");
            System.out.print("Enter the name: ");
            name = in.nextLine();
            name = name.trim();
        }
        // add device type
        System.out.print("Enter the type");
        type = in.nextLine();
        type = type.trim();
       // Check if the type is empty
        while (type.equals("")) {

            System.out.println("Please enter the type correctly the field is empty .");
            System.out.print("Enter the type: ");
            type = in.nextLine();
            type = type.trim();
        }
        boolean WrongType=true;
        while (WrongType){
        switch (type.toUpperCase()) {
            case "RFID":
            case "IO":
            case "CAMERA":
                WrongType=false;
                break;

            default:
                System.out.println("The type should only be (RFID,IO,CAMERA) please Enter the type correctly:");
                type = in.nextLine();
                type = type.trim();
        }}
        /* add device id */
        System.out.print("Enter the id");
        ID = in.nextLine();
        ID = ID.trim();
        // Check if the ID is empty
        while (ID.equals("")) {

            System.out.println("Please enter the id correctly the field is empty .");
            System.out.print("Enter the ID: ");
            ID = in.nextLine();
            ID = ID.trim();
        }
        boolean equalID=false;
do{
    equalID = false;
        for(int i=0;i< listd.size();i++){
            if(listd.get(i).ID.equalsIgnoreCase(ID)) {
                equalID = true;
                break;
            }
}
    // Check if the ID already exists
    if(equalID){
        System.out.println("This ID is already exict");
        System.out.print("Enter the ID: ");
        ID = in.nextLine();
        ID = ID.trim();
        while (ID.equals("")) {

            System.out.println("Please enter the id correctly the field is empty .");
            System.out.print("Enter the ID: ");
            ID = in.nextLine();
            ID = ID.trim();
        }
    }
}while(equalID);
        listd.add(this);
        System.out.println("Device added successfully!");
    }


}
