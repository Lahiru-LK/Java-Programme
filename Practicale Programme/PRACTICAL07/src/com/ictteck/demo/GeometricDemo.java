package com.ictteck.demo;

import com.ictteck.Geometric.Circle;
import com.ictteck.Geometric.ResizableCircle;

import java.util.Random;
import java.util.Scanner;

public class GeometricDemo {

   static Scanner inputx = new Scanner(System.in);



    public static void main(String[] args) {

        Circle c = new Circle(getRadiusUser());
        System.out.println("Perimiter of the circle : " + c.getPerimeter());
        System.out.println("Area of the circle : " + c.getArea());


        ResizableCircle re = new ResizableCircle(getRadiusUser());
        System.out.println("Perimiter of the RC  circle : " + re.getPerimeter());
        System.out.println("Area of the RC  circle : " + re.getArea());

        re.resize(getprecentUser());
        System.out.println("Perimiter of the RC resized circle : " + re.getPerimeter());
        System.out.println("Area of the RC resized circle : " + re.getArea());

    }
//-------------------------------------------------------
    public static double getRadiusUser()
    {
        System.out.print("Enter Radius Values : ");
        double Uradius = 0.0;

        do {

            Uradius = inputx.nextDouble();
            if (Uradius < 0)
            {
                System.out.printf("Negative values are not allowed, Please re-enter a positive value :");
            }
        }while (Uradius < 0);


        return Uradius;
    }
//----------------------------------
    public static int getprecentUser()
    {
        System.out.print("\nEnter Radius integer percentage Values : ");
        int Uprecent;

       do {

           Uprecent = inputx.nextInt();

           if ((Uprecent < -100) || (Uprecent > 100))
           {
               System.out.print("Value entered is invalid, Please re-enter a value between -100 to +100 : ");
           }

       }while ((Uprecent < -100) || (Uprecent > 100));

        return Uprecent;
    }
}
