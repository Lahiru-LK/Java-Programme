import java.util.Scanner;

public class Circle implements GeometricObject {



    @Override
    public double getPerimeter() {

        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {

       while (true)
       {
            Scanner x = new Scanner(System.in);

            System.out.print("Enter radius : ");
            double red = x.nextInt();

            try {
                if (red <= 0){
                    System.out.println("Negative values are not allowed !");
                }

            }catch(Exception e)
            {
                /*System.out.print("Enter radius : ");
                red = x.nextInt();*/
            }
       }

    }
}
