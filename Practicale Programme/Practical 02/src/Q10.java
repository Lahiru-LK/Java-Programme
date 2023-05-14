public class Q10 {
    public static void main(String[]args){
        float sum=0;
        float avg=0;
        int i=1;

        do{
            sum= sum+i;
            avg=sum/i;
            ++i;
        }while(i!=101);
        System.out.print("\nThe sum is : "+sum+"\nThe avg is : "+avg);
    }
}
