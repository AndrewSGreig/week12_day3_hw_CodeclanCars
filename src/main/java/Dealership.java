import vehicle.Engine;
import vehicleType.VehicleType;
import vehicle.Tyres;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership extends VehicleArray{

    //instance vars
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    int till;


    //constructor
    public Dealership(ArrayList<Vehicle> vehicles, int till){
        super(vehicles);
        this.till = till;
//        this.vehicles = vehicles;
    }

    //methods
//    public ArrayList<Vehicle> getVehicles() {
//        return vehicles;
//    }
//
//    public void setVehicles(ArrayList<Vehicle> vehicles) {
//        this.vehicles = vehicles;
//    }
//
//    public int getNoOfVehicles(){
//        return vehicles.size();
//    }
//
//    public Vehicle getVehicle(int index){
//        return vehicles.get(index);
//    }
//
//    public void addToVehicleList(Vehicle vehicle){
//        System.out.println(vehicles.size());
//        vehicles.add(vehicle);
//        System.out.println(vehicles.size());
//    }

    public int getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void increaseTill(int increaseBy){
        this.till += increaseBy;
    }

    public void decreaseTill(int decreaseBy){
        this.till -= decreaseBy;
    }
}
