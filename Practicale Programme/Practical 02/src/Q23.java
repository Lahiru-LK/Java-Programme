import java.util.Scanner;

public class Q23 {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= n.nextInt();


        while (num>0) {
            int digit = num%10;
            System.out.print(digit);
            System.out.print(" ");
            num /=10;     }
    }
}
