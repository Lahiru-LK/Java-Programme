import java.util.Scanner;

public class Q07 {
    public static void main(String[]args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = n.nextInt();

        if(num%2==0){
            System.out.println("Odd");
        }
        else {
            System.out.println("Evene");
        }
    }
}
