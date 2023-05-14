import java.util.Scanner;
import java.lang.Math;

public class  Q25
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Binary value:"); // 101 = 5
        int binary=input.nextInt();
        int temp=binary;
        int temp2=binary;
        while(temp!=0)
        {
            if(temp%10>1)
            {
                System.out.println("Not Invalid Binary:"+binary);
                System.exit(0);
            }
            temp=temp/10;
        }
        int i=0;
        int sum=0;
        while(binary!=0)
        {
            if(binary%10==1)
            {
                double b=Math.pow(2,i);
                int value=(int)b;
                sum=sum+value;
                ++i;
            }
            else
            {
                ++i;
            }
            binary=binary/10;
        }
        System.out.println("Equivalent decimal number"+temp2+" -->: "+sum);
    }
}
