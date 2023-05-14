import java.util.Scanner;

public class Q19{
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter name: ");
        String rev= n.nextLine();

        StringBuffer sb = new StringBuffer(rev);
        System.out.print(sb.reverse());
    }
}
