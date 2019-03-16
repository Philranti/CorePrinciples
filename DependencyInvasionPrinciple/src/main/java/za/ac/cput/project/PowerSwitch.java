package za.ac.cput.project;

public class PowerSwitch {              //Violation
    public Television tv;
    public boolean on;
    public PowerSwitch(Television tv) {
        this.tv = tv;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            tv.turnOff();
            this.on = false;
        } else {
            tv.turnOn();
            this.on = true;
        }

    }
}
