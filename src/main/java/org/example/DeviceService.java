package org.example;



public class DeviceService {


    private DeviceRepository repository;



    public DeviceService(DeviceRepository OR) {
        this.repository = OR;

    }

    public  String CheckAll(String ID,String name,String type) {

        String IdResult, nameResult, TypeResult;
        nameResult = checkName(name);
        IdResult = checkID(ID);
        TypeResult = checkType(type);




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
    public  String registerDevice(Device d) {


        String result = CheckAll(
                d.getID(),
                d.getName(),
                d.getType()
        );

        if (!result.equals("Done")) {
            return result;
        }

        repository.saving(d);

        return "Done";
    }

    // Check if the ID is empty or Already Exist
    public String checkID(String ID) {

        ID = ID.trim();

        if (ID.isEmpty()){


            return "EMPTY_ID";
        }
       if(repository.existsById(ID)){

            return "EXIST_ID";
        }


   return "valid";

    }

    public String checkType(String type) {
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

    public String checkName(String name) {

        // Check if the name is empty
        name = name.trim();
      if (name.isEmpty()){

          return "EMPTY_NAME";
      }
        return "valid";
    }

}
