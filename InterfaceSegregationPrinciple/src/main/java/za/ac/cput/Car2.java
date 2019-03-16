package za.ac.cput;

public class Car2  implements Transportation2, Movable{
    private double price;
    private String color;

    @Override
    public double getPrice() {

       return this.price = 25000.00;
    }

    @Override
    public String getColor() {
        return this.color= "Red";
    }

    @Override
    public void move(){
        System.out.println("Start moving car.");
    }

    @Override
    public String toString(){
        return "Car Price: R"+getPrice()+"\tCar Color: "+getColor();
    }
}
