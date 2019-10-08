package com.company;

import java.util.Scanner;

public class Reverse{
    public static void reverseString(){
        System.out.println("Enter something:");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String rts = new StringBuffer(str).reverse().toString();
        System.out.println(rts);
        inp.close();
    }
}
