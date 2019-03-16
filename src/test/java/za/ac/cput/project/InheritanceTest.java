package za.ac.cput.project;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InheritanceTest {
        Rectangle r1 = new Rectangle(6, 5);
        Box b1 = new Box(6, 5, 2);;

        @Test
        public void checkRectangle(){

        System.out.println("Area of r1: " + r1.area( ));
        assertEquals(30, r1.area());

        }

        @Test
        public void checkBox() {
            System.out.println("Area of b1: " + b1.area());
            assertEquals(104, b1.area());
        }

}
