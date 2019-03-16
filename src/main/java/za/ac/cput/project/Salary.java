package za.ac.cput.project;

public class Salary extends Employee {
    private double salary;

    public Salary(String nam, double sal)  {
        super(nam);
        salary = sal;
    }

    public double getSalary()  {
        return salary;
    }

    public double pay()  {
        return salary;
    }

    public String toString()  {
        return  String.format("%s%s%.2f%s", super.toString(), " (Salary is ", salary, ")");
    }
}
