import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;

public class Remuneration
{
    public static void main(String []args)
    {
        double[] salary = {10000.00, 20000.00, 10000.00, 15000.00, 25000.00};
        double[] bonus = {10.0,5.0,15.0,20.0,10.0};

        RemunerationDemo r = new RemunerationDemo();

        r.calcSalary(salary,bonus);
        r.printSalary(salary);

    }
}