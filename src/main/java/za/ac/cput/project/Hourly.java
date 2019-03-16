package za.ac.cput.project;

public class Hourly extends Employee {
    private double rate;
    private double hours;

    public Hourly(String n, double r, double hrs)  {
        super(n);
        rate = r;
        hours = hrs;
    }

    public double getRate()  {
        return rate;
    }

    public double getHours()  {
        return hours;
    }

    public double pay()  {
        return rate * hours;
    }

    public String toString()  {
        return super.toString() + " (Rate is R" + rate + " and Hours are " + hours + ')';
    }
}
