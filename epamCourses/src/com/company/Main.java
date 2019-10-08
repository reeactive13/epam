package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose program (1-5): \n 1. Hello \n 2. Reverse \n 3. Random");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                Hello.sayHello();
                break;
            case 2:
                Reverse.reverseString();
                break;
            case 3:
                Random.randomNumbers();
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}

