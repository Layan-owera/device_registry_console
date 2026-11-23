package org.example;



public class DeviceService {


    private DeviceRepository repository;



    public DeviceService(DeviceRepository OR) {
        this.repository = OR;

    }

    public  String CheackAll(String ID,String name,String type) {

        String IdResult, nameResult, TypeResult;
        nameResult = cheackName(name);
        IdResult = cheackID(ID);
        TypeResult = cheackType(type);




            if (!nameResult.equals("valid")) {
                return nameResult;
            }

            if (!TypeResult.equals("valid")) {
                return TypeResult;
            }
            if (!IdResult.equals("valid")) {
                return IdResult;
            }


        return "Done";
    }
    public  void registerDevice(Device d) {

        repository.saving(d);

    }

    // Check if the ID is empty or Already Exist
    public String cheackID(String ID) {

        ID = ID.trim();

        if (ID.isEmpty()){


            return "EMPTY_ID";
        }
       if(repository.existsById(ID)){

            return "EXIST_ID";
        }


   return "valid";

    }

    public String cheackType(String type) {
        // Check if the type is empty
        type = type.trim();
        if (type.isEmpty()){
            return "EMPTY_TYPE";
        }
        if (!type.equalsIgnoreCase("RFID") &&
                !type.equalsIgnoreCase("IO") &&
                !type.equalsIgnoreCase("CAMERA")) {

            return "INVALID_TYPE";
        }

        return "valid";
    }

    public String cheackName(String name) {

        // Check if the name is empty
        name = name.trim();
      if (name.isEmpty()){

          return "EMPTY_NAME";
      }
        return "valid";
    }

}
