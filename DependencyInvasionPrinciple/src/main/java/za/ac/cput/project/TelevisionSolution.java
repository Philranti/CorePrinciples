package za.ac.cput.project;

public class TelevisionSolution implements Switchable {  //Solution

    @Override
    public void turnOn() {
        System.out.println("Television turned on...");

    }

    @Override
    public void turnOff() {
        System.out.println("Television turned off...");
        System.out.println();
    }
}
