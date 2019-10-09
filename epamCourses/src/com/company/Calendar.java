package com.company;

import java.time.Month;
import java.util.Scanner;

public class Calendar {
    static void months() {
        System.out.println("Enter month number: ");
        Scanner input = new Scanner(System.in);
        System.out.println(Month.of(input.nextInt()));
    }
}
