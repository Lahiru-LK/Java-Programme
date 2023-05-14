package com.ictteck;

import javafx.scene.control.TableRow;

public class UncheckedExample {
    public static void main(String[] args) {
        int myNumber[] = {1,2,3,4,5};
       // System.out.println(myNumber[7]);

        try {
            System.out.println(myNumber[7]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());

        }
    }
}
