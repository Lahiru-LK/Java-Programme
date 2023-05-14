package com.ictteck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkedExample {
    public static void main(String[] args) throws FileNotFoundException {

        /*fist method-----------------------------

       try {
            FileInputStream fis = new FileInputStream("D://myText.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     -----------------------------------*/


        //second method-----------------------------
        FileInputStream fis = new FileInputStream("D://myText.txt");


       //-----------------------------------------------
    }

}
