package za.ac.cput;

public class Plane implements Transportation2, Movable, Flyable { // Solution
    private double price;
    private String color;

    @Override
    public double getPrice() {
       return this.price = 500000;
    }

    @Override
    public String getColor() {
       return this.color= "White";
    }

    @Override
    public void move(){

        System.out.println("Start moving plane.");
    }

    @Override
    public void fly(){

        System.out.println("Start flying plane.");
    }
    @Override
    public String toString(){
        return "Plane Price: R"+getPrice()+"\tPlane Color:"+getColor();
    }
}
