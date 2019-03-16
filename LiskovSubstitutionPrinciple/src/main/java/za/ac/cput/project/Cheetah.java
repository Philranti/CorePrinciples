package za.ac.cput.project;

public class Cheetah extends Animal {


    @Override
   public void run() {
        super.run();
    }

    public void fly(){ // Violation of Liskov - Cheetah cannot fly
       super.fly();
    }
}
