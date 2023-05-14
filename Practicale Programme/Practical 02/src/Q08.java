public class Q08 {
    public static void main(String[]args){
        float sum=0;
        float avg=0;

        for(int i=1; i<=100; i++){
            sum= sum+i;
            avg=sum/i;

        }
        System.out.print("\nThe sum is : "+sum+"\nThe avg is : "+avg);
    }
}
