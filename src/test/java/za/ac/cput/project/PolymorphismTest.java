package za.ac.cput.project;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PolymorphismTest {
    private int MAX_EMPLOYEES = 10;
    Employee[] employees;
    Employee emp1;

    public static double payIncrease(Employee emp, double amt){
        return amt += emp.pay();
    }

    @Test
    public void mainEmployee()  {
         employees = new Employee[MAX_EMPLOYEES];

        int emp = 0;
        employees[emp++] = new Hourly("George Jones", 75.00, 2.5); // emp++ - incrementing
        employees[emp++] = new Salary("Dolly Parton", 125.00);
        employees[emp++] = new Hourly("Willie Nelson", 85.00, 3.0);
        employees[emp++] = new Salary("Jim Reeves", 150.00);
        employees[emp++] = new Hourly("Tammy Wynette", 65.00, 2.0);

        for (int i = 0; i < emp; ++i)  {
            System.out.println("Employee:  " + employees[i]);
            System.out.println(String.format("%s%.2f", "pay:  R", employees[i].pay()));
            System.out.println();

        }


        emp1 = new Hourly("Jimmy Jungle", 20.00, 2);
        System.out.println("Employee "+ emp1.getName()+ " new Salary :R"+PolymorphismTest.payIncrease(emp1, 100));

    }

    @Test
    public void checkIncrease(){
        emp1 = new Hourly("Joseph Morton", 30.00, 2);
        assertEquals(160.00, PolymorphismTest.payIncrease(emp1, 100));
    }
}
