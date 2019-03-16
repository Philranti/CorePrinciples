package za.ac.cput.project;

public class Eagle extends Animal {
    @Override
    public void run() { // Violation of Liskov - Eagle cannot run
        super.run();
    }

    public void fly(){
        super.fly();
    }

}
