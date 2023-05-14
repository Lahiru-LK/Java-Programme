import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        name = input.nextLine();
        System.out.println("Hello World...!!!, from " + name);

    }
}
