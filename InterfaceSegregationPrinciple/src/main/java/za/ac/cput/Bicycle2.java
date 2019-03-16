package za.ac.cput;

public class Bicycle2 implements Transportation2 { // Solution
     private double price;
     private String color;

    @Override
    public double getPrice() {

        return this.price = 2300.00;

    }
    @Override
    public String getColor() {

       return this.color= "Grey";

    }
    @Override
    public String toString(){
        return "Bicycle Price: R"+getPrice()+"\t Bicycle Color: "+getColor();
    }
}
