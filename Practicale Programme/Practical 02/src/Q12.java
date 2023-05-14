import java.util.Scanner;

public class Q12 {
    public static void main(String[]args){

        Scanner n = new Scanner(System.in);
        System.out.println("Enter  start number: ");
        int num1 = n.nextInt();

        int first = 0, second= 1;
        for(int i=0; i<num1; i++){
            System.out.print(first+" ");

            int next = first+second;
            first=second;
            second=next;

        }


    }
}
