package com.ictteck.Geometric;

import static java.lang.Math.*;

public class Circle  implements GeometricObject{
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius );
    }

    @Override
    public double getArea() {
        return (PI * pow(radius,2));
    }
}
