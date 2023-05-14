import java.util.Scanner;

public class Q24 {

    public static void main(String[]args){
        int c=0;
        float temp=0,temp1=0,temp2=0,temp3=0,temp4=0,temp5=0,temp6=0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Income : ");
        float num= n.nextFloat();

        do{
            c+=1;


           switch (c){
               case 1:
                   System.out.println("IncomeTax :"+temp);

                   break;
               case 2:
                   num -= 600000;
                   temp1 = temp + ((600000 * 4) / 100);
                   System.out.println("IncomeTax :"+temp1);

                   break;
               case 3:
                   num -= 600000;
                   temp2 = temp1 + ((600000 * 8) / 100);
                   System.out.println("IncomeTax :"+temp2);

                   break;
               case 4:
                   num -= 600000;
                   temp3 = temp2 + ((600000 * 12) / 100);
                   System.out.println("IncomeTax :"+temp3);

                   break;
               case 5:
                   num -= 600000;
                   temp4 = temp3 + ((600000 * 16) / 100);
                   System.out.println("IncomeTax :"+temp4);

                   break;
               case 6:
                   num -= 600000;
                   temp5 = temp4 + ((600000 * 20) / 100);
                   System.out.println("IncomeTax :"+temp5);

                   break;
               case 7:
                   num -= 600000;
                   temp6 = temp5 + ((600000 * 24) / 100);
                   System.out.println("IncomeTax :"+temp6);

                   break;

           }
        }while (num>600000);
        System.out.println("All tax sum :"+(temp+temp1+temp2+temp3+temp4+temp5+temp6));



       /* if(num>=600000) {
            num -= 600000;
            temp1 = temp + ((600000 * 4) / 100);

            if(num>=600000) {
                num -= 600000;
                temp2 = temp1 + ((600000 * 8) / 100);

                if(num>=600000) {
                    num -= 600000;
                    temp3 = temp2 + ((600000 * 12) / 100);

                    if(num>=600000) {
                        num -= 600000;
                        temp4 = temp3 + ((600000 * 16) / 100);

                        if(num>=600000) {

                            num -= 600000;
                            temp5 = temp4 + ((600000 * 20) / 100);

                            if(num>=600000) {
                                num -= 600000;
                                temp6 = temp5 + ((600000 * 24) / 100);

                                System.out.println("IncomeTax :"+temp6);
                                System.exit(0);

                            }
                            else{
                                System.out.println("IncomeTax :"+temp5);
                            }
                        }
                        else{
                            System.out.println("IncomeTax :"+temp4);
                        }
                    }
                    else{
                        System.out.println("IncomeTax :"+temp3);
                    }

                }
                else{
                    System.out.println("IncomeTax :"+temp2);
                }
            }
            else{
                System.out.println("IncomeTax :"+temp1);
            }
        }
        else{
            System.out.println("IncomeTax :"+temp);
        }*/



    }
}

