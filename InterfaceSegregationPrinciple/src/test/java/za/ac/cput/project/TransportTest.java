package za.ac.cput.project;

import org.junit.Test;
import za.ac.cput.*;

public class TransportTest {
    @Test
    public void testBuildBicycle() throws Exception {
        Bicycle2 bi= TransportBuilder.buildBicycle();
        System.out.println(bi);
        System.out.println();
    }

    @Test
    public void testBuildCar() throws Exception {
        Car2 car= TransportBuilder.buildCar();
        System.out.println(car);
        System.out.println();
    }

    @Test
    public void testBuildPlane() throws Exception {
        Plane plane=TransportBuilder.buildPlane();
        System.out.println(plane);
        System.out.println();
    }
}
