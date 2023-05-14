import java.util.Scanner;

public  class Q04{
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);

        System.out.print("Enter 'a' value : ");
        double a = x.nextDouble();

        System.out.print("Enter 'b' value : ");
        double b = x.nextDouble();

        System.out.print("Enter 'c' value : ");
        double c = x.nextDouble();

        if(a<b && a<c){
            if(b<c){
                System.out.println("Accinding order is : "+a+" "+b+" "+c);
            }
            else{
                System.out.println("Accinding order is : "+a+" "+c+" "+b);
            }


        }else if (b<a && b<c){
            if(a<c){
                System.out.println("Accinding order is : "+b+" "+a+" "+c);
            }
            else {
                System.out.println("Accinding order is : "+b+" "+c+" "+a);
            }

        }
        else {
            if(a<b){
                    System.out.println("Accinding order is : "+c+" "+a+" "+b);
                }
                System.out.println("Accinding order is : "+c+" "+b+" "+a);
            }
    }
}