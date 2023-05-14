import java.util.Scanner;

public class Q20 {
    public static void main(String[]args){
        String reverST="";

        Scanner n = new Scanner(System.in);
        System.out.print("Enter name: ");
        String strn= n.nextLine();

       int strLen = strn.length();

       for (int i=(strLen-1); i>=0; --i){
           reverST = reverST+strn.charAt(i); //changing string attaching  "reverST"
       }
       if(strn.toLowerCase().equals(reverST.toLowerCase())){
           System.out.println("Palindrome : "+strn+" "+reverST);
       }
       else{
           System.out.println("not Palindrome : "+strn+" "+reverST);
       }

    }
}
