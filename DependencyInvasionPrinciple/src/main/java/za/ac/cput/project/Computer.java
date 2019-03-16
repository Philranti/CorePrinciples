package za.ac.cput.project;

public class Computer implements Switchable {  //Solution
    @Override
    public void turnOn() {
        System.out.println("Computer has turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer has turned off...");
        System.out.println();
    }
}