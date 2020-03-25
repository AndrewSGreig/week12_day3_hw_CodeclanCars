package vehicle;

//public class Tyres extends Vehicle {
public class Tyres{
    //instance vars
    private String manufacturer;
    private int size;



    //constructor
//    public Tyres(String manufacturer, int size, String colour, int price, Engine engine, Tyres tyres, String make, String model){
    public Tyres(String manufacturer, int size){
//        super(colour, price, make, model);
//        super(make, model, engine, tyres, colour, price);
        this.manufacturer = manufacturer;
        this.size = size;
    }

    //methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
