package com.ictec.util;

import java.util.Scanner;

public class HelloWorld {

    private String name;
    private Scanner input ;

    public void printGreeting()
        {
            input = new Scanner(System.in);
            System.out.print("Enter name : ");
            name = input.nextLine();
            System.out.println("HalloWorld"+name);
        }

}
