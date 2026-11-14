package org.example;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *Class to search for devices by ID.
 */
public class Search {

    Scanner in=new Scanner(System.in);

    public String id;

    /*methode allow user to search by id*/
    public void search(ArrayList<add_device> listd) {

        /*Check if the list is empty */
        if (listd.size() == 0) {
            System.out.println("There is no device in the list");
            return;
        }
        System.out.println("Search fro yhe device you want by id ");
        System.out.println("Enter the id :");
        id = in.nextLine();

        boolean found = false;
        /*loop to compare all list device id with the id that user enter*/
            for (int i = 0; i < listd.size(); i++) {
                if (listd.get(i).ID.equalsIgnoreCase(id)) {
                    System.out.println("name:" + listd.get(i).name);
                    System.out.println("type:" + listd.get(i).type);
                    System.out.println("id:" + listd.get(i).ID);
                    found = true;
                    break;
                }

            }

        // If no device matches the ID
        if (!found) {
            System.out.println("No device found");
        }

}}
