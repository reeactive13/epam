package optionalTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            array.add(input.nextInt());
        }
        System.out.println("Result: " + shortestLongest());
    }

    static int shortestLongest() {
        int min = array.get(0).toString().length();
        int minNumber = 0;
        for (int number : array) {
            if(String.valueOf(number).length() < min){
                min = String.valueOf(number).length();
                minNumber = number;
            }
        }
        return min;
    }
}
