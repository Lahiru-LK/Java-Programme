import java.util.Scanner;

public class Q05{
    public static void main(String[]args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        float temp = T.nextFloat();

        if(30<temp){
            System.out.println("Hot 🥵");
        } else if (20<temp && temp<=30) {
            System.out.println("Warm 🥴");
        }
        else if (10<temp && temp<=20) {
            System.out.println("Fine 🥰");
        }
        else{
            System.out.println("Cold 🥶");
        }
    }
}
