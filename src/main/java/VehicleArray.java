import vehicle.Vehicle;

import java.util.ArrayList;

public class VehicleArray {

    //instance vars
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();


    //constructor
    public VehicleArray(ArrayList<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    //methods
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getNoOfVehicles(){
        return vehicles.size();
    }

    public Vehicle getVehicle(int index){
        return vehicles.get(index);
    }

    public void addToVehicleList(Vehicle vehicle){
//        System.out.println(vehicles.size());
        vehicles.add(vehicle);
//        System.out.println(vehicles.size());
    }

}
