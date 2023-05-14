import java.util.Scanner;

public class Q13 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter  start number: ");
        int num1 = n.nextInt();


        float s =0;
        for (int i = 1; i <= num1; i++) {
             s = s + (1 / i);
            System.out.printf("\nSum is %.2f", s);
        }

    }
}
