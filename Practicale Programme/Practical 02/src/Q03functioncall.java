import java.util.Scanner;


public class Q03functioncall{

    public static void main(String[]args){



        while (true){
            System.out.println("\n01- Area of a square\n02- Area of a circle\n03- Area of a rectangle\n04- Area of a cylinder\n05-exit");

            Scanner f = new Scanner(System.in);
            System.out.print("Your choice : ");
            int choice = f.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Area of a square");
                    square();
                    break;
                case 2:
                    System.out.println("Area of a circle");
                    circle();
                    break;
                case 3:
                    System.out.println("Area of a rectangle");
                    rectangle();
                    break;
                case 4:
                    System.out.println("Area of a cylinder");
                    cylinder();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.exit(1);
            }
        }//while close

    }
    public static void square(){
        double Answer;
        Scanner L1 = new Scanner(System.in);
        System.out.print("Enter length value : ");
        double length = L1.nextDouble();

        Answer = length*length;
        System.out.println("Area of a square is: "+Answer);
    }
    public static void circle(){
        double Answer;
        double pie=3.14285714286;//22/7

        Scanner L2 = new Scanner(System.in);
        System.out.print("Enter radius value : ");
        double radius = L2.nextDouble();

        Answer = pie*(radius*2);
        System.out.println("Area of a circle is: "+Answer);
    }
    public static void rectangle(){
        double Answer;

        Scanner L3 = new Scanner(System.in);
        System.out.print("Enter side 01 value : ");
        double side1 = L3.nextDouble();

        Scanner L4 = new Scanner(System.in);
        System.out.print("Enter side 02 value : ");
        double side2 = L4.nextDouble();

        Answer = side1*side2;
        System.out.println("Area of a rectangle is: "+Answer);
    }
    public static void cylinder(){
        double Answer;
        double pie=3.14285714286;//22/7

        Scanner L5 = new Scanner(System.in);
        System.out.print("Enter radius2 value : ");
        double radius2 = L5.nextDouble();

        Scanner L6 = new Scanner(System.in);
        System.out.print("Enter height value : ");
        double height= L6.nextDouble();

        Answer = 2 * pie * radius2 * height;
        System.out.println("Area of a cylinder is: "+Answer);
    }
}


