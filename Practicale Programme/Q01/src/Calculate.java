import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;


public class Calculate

{
    private static final DecimalFormat df = new DecimalFormat("0.0000");
    Scanner x=new Scanner(System.in);

    public void Sphere()
    {
        System.out.print("Sphere\n-----------\nEnter the radius : ");
        double rad = x.nextDouble();
        System.out.print("Sphere volume is : " + df.format(getSphereVolume(rad)));
    }

    public void Cone()
    {
        System.out.print("Cone\n-----------\nEnter the radius : ");
        double rad = x.nextDouble();

        System.out.print("Enter the height : ");
        double hei = x.nextDouble();

        System.out.print("Sphere volume is : " + df.format(getConeVolume(rad,hei)));
    }

    public void Myshape()
    {
        System.out.print("Myshape\n-----------\nEnter the radius of Sphere : ");
        double rad = x.nextDouble();

        System.out.print("Enter the height of Cone : ");
        double hei = x.nextDouble();

        System.out.print("Myspace volume is : " + df.format(getMyShapeVolume(rad,hei)));
    }





    private double getSphereVolume(double radius)
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }

    private  double getConeVolume(double radius, double height)
    {
        return (1.0/3.0) * Math.PI * Math.pow(radius,2) * height;
    }

    private  double getMyShapeVolume(double radius, double height)
    {
        return ((1.0/3.0) * Math.PI * Math.pow(radius,2) * height  + (1.0/3.0) * Math.PI * Math.pow(radius,2) * height  );
    }
}



