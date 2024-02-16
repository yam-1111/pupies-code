package act7;

public class Car {
    /*Unique ID of each car*/
    private static int id_count = 1;
    private int id;

    /*attributes of car */
    private String brand;
    private String model;
    private String plate_no;
    private int registered_year;
  

    public Car(String brand, String model, String plate_no, int registered_year ) {
        this.id = id_count++;
        this.brand = brand;
        this.model = model;
        this.plate_no = plate_no;
        this.registered_year = registered_year;
    }

    /*Getters */

    public int getId(){
        return id;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getPlateNo(){
        return plate_no;
    }
    public int getRegisteredYear(){
        return registered_year;
    }


}
