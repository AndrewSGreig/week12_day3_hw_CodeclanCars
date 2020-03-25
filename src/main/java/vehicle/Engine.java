package vehicle;

//public class Engine extends Vehicle {
public class Engine{


    //instance vars
    private int engineSize;

    //constructor
//    public Engine(int engineSize, String make, String model, Engine engine, Tyres tyres, String colour, int price){
    public Engine(int engineSize){
//        super(colour, price, make, model);
//        super(make, model, engine, tyres, colour, price);
        this.engineSize = engineSize;
    }

    //methods
    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

}

