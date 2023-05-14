import java.util.Scanner;
import java.io.*;
public class Q22
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        String str="",str2="";
        char ch;
        System.out.println("Enter String: ");
        str=input.nextLine();
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            int c=ch;
            if(c>=65 && c<=90)
            {
                if(c==88)
                {
                    ch='A';
                    str2=str2+ch;
                }
                else if(c==89)
                {
                    ch='B';
                    str2=str2+ch;
                }
                else if(c==90)
                {
                    ch='C';
                    str2=str2+ch;
                }
                else
                {
                    c=c+3;
                    ch=(char)c;
                    str2=str2+ch;
                }
            }
            else if(c>=97 && c<=122)
            {
                if(c==120)
                {
                    ch='A';
                    str2=str2+ch;
                }
                else if(c==121)
                {
                    ch='B';
                    str2=str2+ch;
                }
                else if(c==122)
                {
                    ch='C';
                    str2=str2+ch;
                }
                else
                {
                    c=(c-32)+3;
                    ch=(char)c;
                    str2=str2+ch;
                }
            }
        }
        System.out.println(str2);
    }
}