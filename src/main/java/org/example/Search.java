package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    Scanner in=new Scanner(System.in);

    public String id;
    public void search(ArrayList<add_device> listd) {
        if (listd.size() == 0) {
            System.out.println("There is no device in the list");
            return;
        }
        System.out.println("Search fro yhe device you want by id ");
        System.out.println("Enter the id :");
        id = in.nextLine();

        boolean found = false;

            for (int i = 0; i < listd.size(); i++) {
                if (listd.get(i).ID.equalsIgnoreCase(id)) {
                    System.out.println("name:" + listd.get(i).name);
                    System.out.println("type:" + listd.get(i).type);
                    System.out.println("id:" + listd.get(i).ID);
                    found = true;
                    break;
                }

            }


        if (!found) {
            System.out.println("No device found");
        }

}}
