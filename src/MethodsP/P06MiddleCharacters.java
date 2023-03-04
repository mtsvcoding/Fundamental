package MethodsP;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(middleChar(input));


    }

    private static String middleChar (String input){
        char[] midChard = input.toCharArray();
        if (midChard.length % 2 != 0){
            char mid = midChard[midChard.length / 2];
            return String.valueOf(mid);
        }else {
            char midA = midChard[midChard.length / 2];
            char midB = midChard[midChard.length / 2 - 1];
            return midB + "" + midA;
        }
    }
}
