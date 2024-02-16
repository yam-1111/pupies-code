package act7;

import java.util.ArrayList;

public class Database {

    // initiate array instance for database
    private ArrayList<Car> db;

    public Database(){
        this.db = new ArrayList<>();
    }

    /*getters */

    /**
     * Search for brand manufacturers
     * args: 
     * query (String) info to lookup.
     * filter (String) name of the Car obj attrs.
     * 
     * returns:
     * results (String)
    */
    public void search(String query, String filter){
        int SIG=0;
        for(Car car : this.db){
            // brand search
            if(filter.equals("brand")){
                if(car.getBrand().equals(query)){
                    System.out.printf("ID : %d\nBRAND: %s\nMODEL: %s\nPLATE NO. %s\nYEAR REGISTRATION: %d\n",
                    car.getId(), car.getBrand(), car.getModel(), car.getPlateNo(), car.getRegisteredYear());
                    SIG=1;
                }
            }
            else if(filter.equals("model")){
                if(car.getModel().equals(query)){
                     System.out.printf("ID : %d\nBRAND: %s\nMODEL: %s\nPLATE NO. %s\nYEAR REGISTRATION: %d\n",
                    car.getId(), car.getBrand(), car.getModel(), car.getPlateNo(), car.getRegisteredYear());
                    SIG=1;
                }
            }
            else if(filter.equals("plate_no")){
                if(car.getPlateNo().equals(query)){
                      System.out.printf("ID : %d\nBRAND: %s\nMODEL: %s\nPLATE NO. %s\nYEAR REGISTRATION: %d\n",
                    car.getId(), car.getBrand(), car.getModel(), car.getPlateNo(), car.getRegisteredYear());
                    SIG=1;
                }
            }
            else if(filter.equals("registration")){
                if(car.getRegisteredYear() == Integer.parseInt(query)){
                     System.out.printf("ID : %d\nBRAND: %s\nMODEL: %s\nPLATE NO. %s\nYEAR REGISTRATION: %d\n",
                    car.getId(), car.getBrand(), car.getModel(), car.getPlateNo(), car.getRegisteredYear());
                    SIG=1;
                }
            }
            else if(filter.equals("id")){
                if(car.getId() == Integer.parseInt(query)){
                   System.out.printf("ID : %d\nBRAND: %s\nMODEL: %s\nPLATE NO. %s\nYEAR REGISTRATION: %d\n",
                    car.getId(), car.getBrand(), car.getModel(), car.getPlateNo(), car.getRegisteredYear());
                    SIG=1;
                }
            }
        }
        if(SIG==0)
            System.out.println("No registration found on the database.");
    }

    /**
     * setters
     * adds new car instance on the db
     * 
     * args: 
     * brand (String)
     * model (String)
     * plate_no (String)
     * registered_year (int)
     * 
     * returns None
    */
    public void append(String brand, String model, String plate_no, int registered_year){
       this.db.add(new Car(brand, model, plate_no, registered_year));
    }

    /**
     * Counts the number of array
     * returns (int) : number of items in array.
     */
    public void len(){
        int i =0;
        for(Car car : this.db)
            i++;
        System.out.printf("Number of cars: %d\n", i);
    }


}
