import java.util.Scanner;

public class Q11 {
    public static void main(String[]args){


        Scanner n = new Scanner(System.in);
        System.out.println("Enter  start number: ");
        int num1 = n.nextInt();
        System.out.println("Enter  end number : ");
        int num2 = n.nextInt();

        int temp=num1;
        do {
            temp=temp*(num1+1);
            System.out.println(num1+"*"+(num1+1)+"="+temp);

            ++num1;
        }while (num1!=num2);

    }
}
