import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you name : ");
        name = input.nextLine();

        System.out.println("...........Hello World..........."+name);

    }
}
