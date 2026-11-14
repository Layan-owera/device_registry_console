package org.example;

import java.util.ArrayList;

public class AllDevice {

    public void list(ArrayList<add_device> listd) {
        if (listd.size() == 0) {
            System.out.println("There is no device in the list");
            return;
        }
    for (int i =0 ;i < listd.size();i++){
        System.out.println("the device number "+i+" is : ");
        System.out.println("Name:"+listd.get(i).name);
        System.out.println("Type:"+listd.get(i).type);
        System.out.println("ID:"+listd.get(i).ID);



    }
}
}
