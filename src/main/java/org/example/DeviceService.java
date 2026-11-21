package org.example;



public class DeviceService {


    private DeviceRepository repository;



    public DeviceService(DeviceRepository OR) {
        this.repository = OR;

    }

    public  String registerDevice(Device d){
        String ID = d.getID();
        String name = d.getName();
        String type = d.getType();
        String IdResult,nameResult,TypeResult;
        IdResult=cheackID(ID);
        nameResult=cheackName(name);
        TypeResult=cheackType(type);

        if(IdResult.equals("valid")&& nameResult.equals("valid") && TypeResult.equals("valid")){

            repository.saving(d);
            return "valid";
        }

        if(!IdResult.equals("valid") ){
            return IdResult;
        }
        if(!nameResult.equals("valid")){
            return nameResult;
        }
        if(!TypeResult.equals("valid")){
            return TypeResult ;
        }
        return "Invalid";
    }

    // Check if the ID is empty or Already Exist
    public String cheackID(String ID) {

        ID = ID.trim();

        if (ID.equals("")){
            System.out.println("hello");

            return "EMPTY_ID";
        }
       if(repository.existsById(ID)){
           System.out.println("hi");

            return "EXIST_ID";
        }


   return "valid";

    }

    public String cheackType(String type) {
        // Check if the type is empty
        type = type.trim();
        if (type.equals("")){
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
      if (name.equals("")){

          return "EMPTY_NAME";
      }
        return "valid";
    }

}
