package za.ac.cput.project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncapsulationTest {
    Encapsulation encap;

    @Before
    public void setEncapsulate(){
        encap = new Encapsulation(208108874, "Phillip", "Information Technology");
    }

    @Test
    public void result(){
        assertEquals(208108874, encap.getStudentNum());
        assertEquals("Phillip", encap.getStudentName());
        assertEquals("Information Technology", encap.getCourse());
    }

}
