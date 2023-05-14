import java.util.Scanner;

public class Q01_b{

    public static  void main(String[]args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = x.nextInt();

        for(int i=0; i<rows; i++){
            for(int y=rows; y>i; y--){
                System.out.print(" ");
            }
            for(int z=0; z<=i; z++){
                System.out.print(" #");
            }
            System.out.print("\n");
        }
    }
}
