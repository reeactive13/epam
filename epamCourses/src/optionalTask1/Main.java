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
        //System.out.printf("Shortest: %d%n", findFirstShortest(array));
        //System.out.printf("Longest: %d (%d)%n", findFirstLongest(array), String.valueOf(findFirstLongest(array)).length());
        //sortByLength();
        //printLengthMoreThenAvg();
        //System.out.printf("Number with the least number of unique digits: %d%n", countUniqueDigits(array));
        //System.out.println(findOnlyEven(array));
        System.out.println(findAscNumber(array));
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
            char[] digits = String.valueOf(number).toCharArray();
            List<Character> uniqueDigits = new ArrayList<>();
            for (char digit : digits) {
                if (!uniqueDigits.contains(digit)) {
                    uniqueDigits.add(digit);
                }
            }
            if (uniqueDigits.size() < min) {
                min = uniqueDigits.size();
                result = number;
            }
        }
        return result;
    }

    private static String findOnlyEven(List<Integer> list) {
        int evenOnlyCounter = 0;
        int evenEqualsNonEvenCounter = 0;
        for (int number : list) {
            int even = 0;
            int notEven = 0;
            char[] digits = String.valueOf(number).toCharArray();
            for (char digit : digits) {
                if (digit % 2 == 0) {
                    even++;
                } else {
                    notEven++;
                }
            }
            if (even == String.valueOf(number).length()) {
                evenOnlyCounter++;
            }
            if (even == notEven) {
                evenEqualsNonEvenCounter++;
            }
        }
        return String.format("Numbers with only even digits: %s. Equal number of even and not even digits: %s", String.valueOf(evenOnlyCounter), String.valueOf(evenEqualsNonEvenCounter));
    }

    private static int findAscNumber(List<Integer> list) {
        for (int number : list) {
            int digitInt = 0;
            int counter = 0;
            char[] digits = String.valueOf(number).toCharArray();

            for (char digit : digits) {
                if (digitInt < digit) {
                    digitInt = digit;
                    counter++;
                }
                if (counter == String.valueOf(number).length()) {
                    return number;
                }
            }
        }
        return 0;
    }
}
