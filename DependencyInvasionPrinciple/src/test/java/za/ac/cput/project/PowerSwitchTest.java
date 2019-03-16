package za.ac.cput.project;

import org.junit.Test;

public class PowerSwitchTest {
    @Test
    public void testTelevisio() throws Exception {
        Switchable sw = new TelevisionSolution();
        Switch s = new PowerSwitchSolution(sw);
        s.press();
        s.press();
    }

    @Test
    public void testComputer() throws Exception{
    Switchable sw = new Computer();
    Switch s = new PowerSwitchSolution(sw);
    s.press();
    s.press();
}
}
