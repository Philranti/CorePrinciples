package za.ac.cput;

public class Bicycle implements Transportation { //Violation
    private double price;
    private String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void move(){}
    @Override
    public void fly(){}
}
