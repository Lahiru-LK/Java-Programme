
import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;


public class RemunerationDemo {
double salary[];
    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public void calcSalary(double[] salary, double[] bonus)
    {
        for(int i=0; i< salary.length; i++)
        {
            salary[i] = salary[i] + (salary[i] * (bonus[i] / 100));
        }
    }
    public void printSalary(double[] salary)
    {

        for(int i = 0; i < salary.length; i++)
        {
            System.out.println("Salary Employee : " +(i + 1)  + " Rs." + df.format( salary[i]) ) ;
        }
    }

}


