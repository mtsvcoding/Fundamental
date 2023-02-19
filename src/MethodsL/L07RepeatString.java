package MethodsL;

import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(concatInput(inputText,num));

    }
    public static String concatInput (String text, int num){
        String result;
        result = String.valueOf(text).repeat(Math.max(0, num));
        return result;
    }
}
