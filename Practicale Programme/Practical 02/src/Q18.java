import java.util.Scanner;
public class Q18
{
    static int mod;
    public static void main(String[] args)
    {
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        int year,month,date;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter  Year:");
        year=input.nextInt();
        System.out.print("Enter  Month:");
        month=input.nextInt();
        System.out.print("Enter  Date:");
        date=input.nextInt();
        if(1900<year)
        {
            for(int i=1901;i<year;i++)
            {
                if(i%4==0)
                {
                    count=count+366;
                }
                else
                {
                    count=count+365;
                }
            }
            count=count+365;
            if(year%4==0)
            {
                for(int i=0;i<month-1;i++)
                {
                    count=count+arr[i];
                    if(i==1)
                    {
                        count=count+1;
                    }
                }
                count=count+date;
                mod=count%7;
                Day(mod);
            }
            else
            {
                for(int i=0;i<month-1;i++)
                {
                    count=count+arr[i];
                }
                count=count+date;
                mod=count%7;
                Day(mod);
            }
        }
        else
        {
            for(int i=0;i<month-1;i++)
            {
                count=count+arr[i];
                if(arr[i]==1)
                {
                    ++count;
                }
            }
            count=count+date;
            mod=count%7;
            Day(mod);
        }
    }
    public static void Day(int m)
    {
        mod=m;
        switch(m)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thirsday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}