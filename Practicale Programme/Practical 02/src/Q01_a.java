import java.util.Scanner;

public class Q01_a {

    public static  void main(String[]args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = x.nextInt();

        for(int i=0; i<rows; i++){
            for(int y=i; y>i; y++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
