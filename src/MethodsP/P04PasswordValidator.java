package MethodsP;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPassword = scanner.nextLine();
        char[] password = inputPassword.toCharArray();

        errorMessage(passDigitCountCheck(password),passConsistCheck(password),passTwoDigitsCheck(password));

    }

    private static boolean passDigitCountCheck(char[] input) {
        int count = 0;
        for (char ignored : input) {
            count++;
        }

        return count >= 6 && count <= 10;
    }

    private static boolean passConsistCheck(char[] input) {
        int[] ascii = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            char temp = input[i];
            ascii[i] = temp;
        }
        int no = 0;
        for (int e : ascii) {
            if (e > 31 && e < 48 || e > 57 && e < 65 || e > 90 && e < 97 || e > 122 && e < 127) {
                no ++;
            }
        }
        return no == 0;
    }

    private static boolean passTwoDigitsCheck(char[] input) {
        int[] ascii = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            char temp = input[i];
            ascii[i] = temp;

        }
        int count = 0;
        for (int e : ascii) {
            if (e > 47 && e < 58) {
                count++;
            }
        }
        return count >= 2;
    }

    private static void errorMessage (boolean a, boolean b, boolean c) {
        if (!a){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!b) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!c) {
            System.out.println("Password must have at least 2 digits");
        }
        if (a && b && c){
            System.out.println("Password is valid");
        }
    }
}
