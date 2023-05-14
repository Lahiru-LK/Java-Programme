package com.ictec.demo;

import com.ictec.geometric.Circle;
import com.ictec.geometric.ResizableCircle;

import java.util.Scanner;

//Class to demonstrate
public class GeometricDemo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Creating 7.0 radius Circle
        Circle c = new Circle(getRadiusFromUser());
        System.out.println("Perimiter of the circle : " + c.getPerimeter());
        System.out.println("Area of the circle : " + c.getArea());
        //Reset the radius as 14.0
        //c.radius = 14.0; //this is not possible since radius has protected access

        //Creating 7.0 radius Resizable Circle
        ResizableCircle rc = new ResizableCircle(getRadiusFromUser());
        System.out.println("Perimiter of the RC  circle : " + rc.getPerimeter());
        System.out.println("Area of the RC  circle : " + rc.getArea());

        //Get resizable percentage from the user, 100%
        rc.resize(getPercentageFromUser());
        System.out.println("Perimiter of the RC resized circle : " + rc.getPerimeter());
        System.out.println("Area of the RC resized circle : " + rc.getArea());

    }

    public static double getRadiusFromUser(){
        System.out.println("Please enter a double value for radius : ");
        double uRadius;
        do{
            uRadius = input.nextDouble();
            if(uRadius < 0){
                System.out.println("Negative values are not allowed, Please re-enter a positive value :");
            }
        }while(uRadius < 0);

        return uRadius;
    }

    public static int getPercentageFromUser(){
        System.out.println("Please enter a integer value for percentage : ");
        int uPercent;
        do{
            uPercent = input.nextInt();
            if((uPercent < -100) || (uPercent > 100)){
                System.out.println("Value entered is invalid, Please re-enter a value between -100 to +100 :");
            }
        }while((uPercent < -100) || (uPercent > 100));

        return uPercent;
    }
}
