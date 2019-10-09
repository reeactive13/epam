package com.company;

import java.time.Month;
import java.util.Scanner;

class Calendar {
    static void months() {
        System.out.println("Enter month number: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int number = input.nextInt();
            if (number > 0 && number <= 12) {
                System.out.println(Month.of(number));
            }
            else{
                System.out.println("Please, enter number from 1 to 12");
            }
        }
        else {
            System.out.println("Please, enter number from 1 to 12");
        }
        input.close();
    }
}
