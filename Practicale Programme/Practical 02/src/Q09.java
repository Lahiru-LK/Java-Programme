public class Q09 {
    public static void main(String[]args){
        float sum=0;
        float avg=0;
        int i=1;
        while (i<=100){
            sum= sum+i;
            avg=sum/i;

            i++;

        }
        System.out.print("\nThe sum is : "+sum+"\nThe avg is : "+avg);
    }
}

