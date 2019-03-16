package za.ac.cput.project;

import org.junit.Test;

public class AnimalTest {
    CheetahSolution cheetah  = new CheetahSolution("Cheetah");
    EagleSolution eagle = new EagleSolution("Eagle");

    @Test
    public void testAnimals(){

        System.out.println(cheetah.toString());
        cheetah.run();
        System.out.println();
        System.out.println(eagle.toString());
        eagle.fly();
    }
}
