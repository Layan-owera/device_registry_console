
package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
     ArrayList<add_device> listd=new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the option you want :");
        System.out.println("1. Add device.");
        System.out.println("2. Show all devices list.");
        System.out.println("3. Search for device.");
        System.out.println("4. Exit.");


        int option = 0;

        while (option!=4) {
            System.out.println("Enter the option you want :");
            try{
            option = in.nextInt();

            if (option == 1) {
                add_device obj1 = new add_device();
                obj1.add(listd);


            } else if (option == 2) {
                AllDevice obj1 = new AllDevice();
                obj1.list(listd);
            } else if (option == 3) {
                Search obj1 = new Search();
                obj1.search(listd);

            }
            else if (option ==4) {
                System.out.println("You choose exit option");
            }


            else {
                System.out.println("Please Enter valid option .");
            }
        }
             catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                in.nextLine();
            }

        }





    }
}