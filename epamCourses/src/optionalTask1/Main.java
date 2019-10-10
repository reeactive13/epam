package optionalTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Enter numbers separated with 'Enter'. To stop enter any non-integer:");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            array.add(input.nextInt());
        }
        System.out.printf("Shortest: %d%n", findFirstShortest(array));
        System.out.printf("Longest: %d%n", findFirstLongest(array));
        sortByLength();
        printLengthMoreThenAvg();
        System.out.println(countUniqueDigits(array));
    }

    private static int findFirstShortest(List<Integer> list) {
        int minLength = list.get(0).toString().length();
        int minNumber = list.get(0);
        for (int number : list) {
            if (String.valueOf(number).length() < minLength) {
                minLength = String.valueOf(number).length();
                minNumber = number;
            }
        }
        return minNumber;
    }

    private static int findFirstLongest(List<Integer> list) {
        int maxLength = list.get(0).toString().length();
        int maxNumber = list.get(0);
        for (int number : list) {
            if (String.valueOf(number).length() > maxLength) {
                maxLength = String.valueOf(number).length();
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    private static void sortByLength() {
        int size = array.size();
        List<Integer> copy = new ArrayList<>(List.copyOf(array));
        System.out.println("Sorted by length:");
        for (int i = 0; i < size; i++) {
            System.out.println(findFirstShortest(copy));
            copy.remove(Integer.valueOf(findFirstShortest(copy)));
        }
    }

    private static void printLengthMoreThenAvg() {
        int lengthSum = 0;
        for (int number : array) {
            lengthSum += String.valueOf(number).length();
        }
        double avgLength = (double) lengthSum / (double) array.size();
        System.out.printf("Length more than average (%s):%n", avgLength);
        for (int number : array) {
            if (String.valueOf(number).length() > avgLength) {
                System.out.printf("%d (%d)%n", number, String.valueOf(number).length());
            }
        }
    }

    private static int countUniqueDigits(List<Integer> list) {
        int result = 0;
        int min = String.valueOf(findFirstLongest(list)).length();
        for (int number : list) {
            char[] chars = String.valueOf(number).toCharArray();
            List<Character> uniqueDigits = new ArrayList<>();
            for (char digit : chars) {
                if (!uniqueDigits.contains(digit)) {
                    uniqueDigits.add(digit);
                }
            }
            if (uniqueDigits.size()<min){
                min = uniqueDigits.size();
                result = number;
            }
        }
        return result;
    }
}
