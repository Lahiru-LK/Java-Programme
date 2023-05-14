
public class Demo {
    public static void main(String[] args) {
        Cylinder x1 = new Cylinder();
        Cylinder x2 = new Cylinder(10.0);
        Cylinder x3 = new Cylinder(7.0, 10.0);






        System.out.println("|Code\t|Radius\t|Height\t|Base Area\t|Volume|");
        System.out.println("|x1\t" + x1.getRadius() + "\t" + x1.getHeight() + "\t" + x1.getArea() + "\t" + x1.getVolume());
        System.out.println("|x2\t" + x2.getRadius() + "\t" + x2.getHeight() + "\t" + x2.getArea() + "\t" + x2.getVolume());
        System.out.println("|x3\t" + x3.getRadius() + "\t" + x3.getHeight() + "\t" + x3.getArea() + "\t" + x3.getVolume());
    }
}