package za.ac.cput;

public class TransportBuilder {  // Solution
    public static Bicycle2 buildBicycle(){
        Bicycle2 bi=new Bicycle2();
        bi.getPrice();
        bi.getColor();
        return bi;
    }
    public static Car2 buildCar(){
        Car2 car=new Car2();
        car.getPrice();
        car.getColor();
        car.move();
        return car;
    }
    public static Plane buildPlane(){
        Plane plane=new Plane();
        plane.getPrice();
        plane.getColor();
        plane.move();
        plane.fly();
        return plane;
    }
}
