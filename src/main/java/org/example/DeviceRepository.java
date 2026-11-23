package org.example;


import java.util.ArrayList;

public interface DeviceRepository {

    Device search(String sch);
    ArrayList<Device> Listing();
    void saving(Device d);
    boolean existsById(String ID);
}
