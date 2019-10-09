package com.company;

import java.util.Scanner;

class SumMult {
    static void evaluate() {
        System.out.println("Enter integers separated by 'Enter'. Enter any non-integer to stop.");
        Scanner input = new Scanner(System.in);
        int res = 0;
        while (input.hasNextInt()){
             res += input.nextInt();
        }
        input.close();
        System.out.print("Result: " + res);
    }
}
