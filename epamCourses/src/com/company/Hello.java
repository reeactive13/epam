package com.company;

import java.util.Scanner;

public class Hello {
    public static void sayHello() {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, " + input.nextLine() + '!');
        input.close();
    }
}
