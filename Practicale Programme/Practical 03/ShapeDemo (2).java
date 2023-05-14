import java.util.Scanner;

public class ShapeDemo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int uInput;
        double radius, cArea,  length, sArea;

        do
        {

            System.out.println("Please enter the number of the shape that you wish to calculate the area");
            System.out.print(" 1.Circle \n 2.Square  \n 0.Exit \n\n\n Enter your answer : ");

            uInput = input.nextInt();

            switch(uInput)
            {
                case 1:
                    System.out.println("You have selected the Shape Circle\n");
                    System.out.print("Please enter value for the radius : ");
                    radius = input.nextInt();
                    System.out.println();
                    cArea = (22 * radius * radius) / 7;
                    System.out.println("The area of the Circle is : " + cArea);
                    break;

                case 2:
                    System.out.println("You have selected the Shape Square\n");
                    System.out.print("Please enter value for the length : ");
                    length = input.nextDouble();
                    System.out.println();
                    sArea = length * length;
                    System.out.println("The area of the Square is : " + sArea);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("You haven't select any shape, Exiting...");
                    break;
            }
        } while(uInput != 0);
    }
}