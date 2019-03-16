package za.ac.cput.project;

public class PowerSwitchSolution implements Switch{ // Solution
    public Switchable sw;
    public boolean on;


    public PowerSwitchSolution(Switchable sw) {
        this.sw = sw;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            sw.turnOff();
            this.on = false;
        } else {
            sw.turnOn();
            this.on = true;
        }

    }
}
