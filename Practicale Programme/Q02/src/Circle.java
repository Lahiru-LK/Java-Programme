public class Circle {
    double radius = 1.0;

    Circle()
    {}

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

class Cylinder extends Circle {
    double height = 1.0;

    Cylinder() {}

    Cylinder(double height) {
        this.height = height;
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double getVolume() {
        return this.getArea() * this.height;
    }
}