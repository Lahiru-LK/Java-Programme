import java.util.Scanner;

public class CalculateTest
{
    public static void main(String []args)
    {

        Calculate c1 = new Calculate();
        Calculate c2 = new Calculate();
        Calculate c3 = new Calculate();

        while(true){
            System.out.print("\n\nPlease enter the number of the shape\n1: Sphere\n2: Cone\n3: Myshape\n0: Exit\n\nEnter your choice : ");

            Scanner x=new Scanner(System.in);
            int choice = x.nextInt();

            switch(choice)
            {
                case 1:
                    c1.Sphere();
                    break;
                case 2:
                    c2.Cone();
                    break;
                case 3:
                    c2.Myshape();
                    break;
                case 0:
                    System.out.print("\nExting.....");
                    System.exit(1);
                    break;
                default:
                    System.out.print("\nNot valid choice");
                    System.exit(1);


            }

        }
        //x.close();


    }
}