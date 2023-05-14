import java.util.Scanner;

public class Q16 {
    public static void main(String[]args){
        int rows, coef = 1, space, i, j;

        Scanner n = new Scanner(System.in);
        System.out.print("Enter row length: ");
        rows = n.nextInt();

        for (i = 0; i < rows; i++) {
            for (space = 1; space <= rows - i; space++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coef = 1;
                else
                    coef = coef * (i - j + 1) / j;

                System.out.print(" "+coef);
            }
            System.out.print("\n");
        }
    }
}
