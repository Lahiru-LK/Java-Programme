public class mytreadDemo {
    public static void main(String[] args) {
//        mytread first = new mytread();
//        first.setName("first");
//
//        mytread second = new mytread();
//        second.setName("Second");


//        first.start(); //tread runt to start() danawa
//        second.start();
//
//
//
////        first.run(); //run() dammama trea eke mian eka run wenwa
////        second.run();

        //Runnable interface

//        MyTreadInter firstInter = new MyTreadInter();
//        Thread firstI = new Thread(firstInter, "FirstInter");
//
//        MyTreadInter secondInter = new MyTreadInter();
//        Thread secondI = new Thread(secondInter, "SecondInter");
//
//        firstI.start();
//        secondI.start();

        MyTreadAddition firstInterAdddtion = new MyTreadAddition();
        Thread firstIA = new Thread(firstInterAdddtion, "FirstInterAddtion");
        firstIA.start();

        MyTreadAddition secondInterMultiplly = new MyTreadAddition();
        Thread secondIM = new Thread(secondInterMultiplly, "SecondInterMultyfly");
        secondIM.start();
  }
}
