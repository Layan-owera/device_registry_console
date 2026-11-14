
package org.example;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     ArrayList<add_device> listd=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int exit=1;
        while (exit==1) {

            int option = 0;


            System.out.println("enter 1");
            option = in.nextInt();

            if (option == 1) {
                add_device obj1 = new add_device();
                obj1.add(listd);


            }
            System.out.println("if you want to exit pree 0");
            exit=in.nextInt();
        }





    }
}