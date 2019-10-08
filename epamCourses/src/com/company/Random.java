package com.company;

import java.util.Scanner;

class Random {
    static void randomNumbers() {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.print(((int) (Math.random() * 100)) + " ");
        }
        System.out.println('\n');
        for (int i = 0; i < quantity; i++) {
            System.out.println((int) (Math.random() * 100));
        }
    }
}
