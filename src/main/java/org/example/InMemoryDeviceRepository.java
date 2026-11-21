package org.example;

import java.util.ArrayList;




public class InMemoryDeviceRepository  implements DeviceRepository{

    private ArrayList<Device> listd=new ArrayList<>();




    @Override
    public boolean existsById(String ID) {
        boolean equalID;
            equalID = false;
            for(int i=0;i< listd.size();i++){
                if(listd.get(i).getID().equalsIgnoreCase(ID)) {
                    equalID = true;
                    break;
                }
            }

        return equalID;
    }

    @Override
    public void saving(String name,String type,String ID){
       Device d=new Device();
       d.setName(name);
       d.setType(type);
       d.setID(ID);
    listd.add(d);
    }

    @Override
    public ArrayList<Device> Listing(){
        return listd;
    }
    @Override
    public Device search(String sch){
        sch = sch.trim();
        /*loop to compare all list device id with the id that user enter*/
        for (int i = 0; i < listd.size(); i++) {
            if (listd.get(i).getID().equalsIgnoreCase(sch)) {
                return listd.get(i);

            }
            if (listd.get(i).getName().equalsIgnoreCase(sch)) {
                return listd.get(i);
            }

        }
        return null;
    }
}
