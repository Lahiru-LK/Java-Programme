public class MyTreadAddition implements Runnable {
    int total = 0;
    double count = 1;

    @Override
    public void run() {

        for (int i = 1; i<=10; i++){

           total = total+i;
           count = count*i;

           System.out.println(Thread.currentThread().getName() + " : "+ total+"\n");
           System.out.println(Thread.currentThread().getName() + " : "+ count);


            try {
                mytread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
