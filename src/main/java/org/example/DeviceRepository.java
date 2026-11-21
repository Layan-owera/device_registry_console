package org.example;


import java.util.ArrayList;

public interface DeviceRepository {

    Device search(String sch);
    ArrayList<Device> Listing();
    void saving(String name,String type,String ID);
    boolean existsById(String ID);
}
