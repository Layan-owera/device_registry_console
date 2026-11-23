package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DeviceServiceTest {
    @Test
    void validRegistration() {


        InMemoryDeviceRepository obj1=new InMemoryDeviceRepository();
        DeviceService obj2=new DeviceService(obj1);
        Device d=new Device();

        d.setName("device1");
        d.setType("io");
        d.setID("1");
        String result=  obj2.registerDevice(d);
        assertEquals("Done", result);
        assertEquals(1, obj1.Listing().size());

    }
    @Test
    void registerDeviceWithBlankName(){
        InMemoryDeviceRepository obj1=new InMemoryDeviceRepository();
        DeviceService obj2=new DeviceService(obj1);
        Device d=new Device();

        d.setName("");
        d.setType("io");
        d.setID("1");
        String result=  obj2.registerDevice(d);

        assertEquals("EMPTY_NAME", result);
        assertEquals(0, obj1.Listing().size());

    }
    @Test
    void registerDeviceWithUnsupportedType (){
        InMemoryDeviceRepository obj1=new InMemoryDeviceRepository();
        DeviceService obj2=new DeviceService(obj1);
        Device d=new Device();

        d.setName("device2");
        d.setType("laptop");
        d.setID("2");
        String result=  obj2.registerDevice(d);

        assertEquals("INVALID_TYPE", result);
        assertEquals(0, obj1.Listing().size());

    }
    @Test
    void registerDeviceWithDuplicateID (){
        InMemoryDeviceRepository obj1=new InMemoryDeviceRepository();
        DeviceService obj2=new DeviceService(obj1);
        Device d1=new Device();

        d1.setName("device1");
        d1.setType("RFID");
        d1.setID("RFID-001");
        String result1=  obj2.registerDevice(d1);

        assertEquals("Done", result1);

        Device d2=new Device();

        d2.setName("device2");
        d2.setType("RFID");
        d2.setID("rfid-001");
        String result2=  obj2.registerDevice(d2);

        assertEquals("EXIST_ID", result2);
        assertEquals(1, obj1.Listing().size());
    }
}
