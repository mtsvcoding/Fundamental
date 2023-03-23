package MethodsP;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] result = topInteger(input).split(" ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            System.out.println();
        }

    }

    private static String topInteger(int a) {
        String top = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            int number = i;
            int temp = 0;
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                temp += digit;
                }

            if (i > 10 && temp % 8 == 0) {
                    sb.append(i).append(" ");
            }

        }
        return top = sb.toString();
    }
}
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int n = Integer.parseInt(scanner.nextLine());
//
//    for (int i = 1; i <= n; i++) {
//
//        if (sumIsDivisibleByEight(i) && hasOneOddDigit(i)) {
//            System.out.println(i);
//        }
//    }
//}
//
//    private static boolean sumIsDivisibleByEight(int number) {
//        int sum = 0;
//        String numberAsString = "" + number;
//        for (int i = 0; i < numberAsString.length(); i++) {
//            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
//            sum += currentDigit;
//        }
//        return sum % 8 == 0;
//    }
//
//    private static boolean hasOneOddDigit(int number) {
//        String numberAsString = "" + number;
//        for (int i = 0; i < numberAsString.length(); i++) {
//            int currentDigit = Character.getNumericValue(numberAsString.charAt(i));
//            if (currentDigit % 2 != 0) {
//                return true;
//            }
//        }
//        return false;
//    }
//}

