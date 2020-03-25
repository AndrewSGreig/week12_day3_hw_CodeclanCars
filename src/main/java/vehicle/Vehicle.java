package vehicle;

import vehicleType.VehicleType;

public abstract class Vehicle {
    //instance vars
    private String colour;
    private int price;
    private String make;
    private String model;
    private Engine engine;
    private Tyres tyres;

    //constructor
    public Vehicle(String make, String model, Engine engine, Tyres tyres, String colour, int price){
   // public Vehicle(String colour, int price, String make, String model){
//        Vehicle car = new Vehicle(engine1, tyres1, vehicleTypes1);
        this.engine = engine;
        this.tyres = tyres;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;

    }

    //methods
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addHybridVehicle(String fuelSource, String colour, int price, String make, String model){
//        Vehicle vehicle = new VehicleType(fuelSource, colour, price,make, model);
        Vehicle vehicle = new VehicleType(fuelSource, engine, tyres, colour, price, make, model);
    }
}
