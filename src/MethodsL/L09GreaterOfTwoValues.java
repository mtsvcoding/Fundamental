package MethodsL;

import java.util.Scanner;

public class L09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int greaterNum = getMax(firstNum, secondNum);
                System.out.println(greaterNum);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char greaterChr = getMax(firstChar,secondChar);
                System.out.println(greaterChr);
                break;
            case "string":
                String firstStr = scanner.nextLine();
                String secondStr = scanner.nextLine();
                String greaterStr = getMax(firstStr, secondStr);
                System.out.println(greaterStr);
                break;
        }
        System.out.println();

    }
    public static int getMax(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static char getMax(char a, char b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static String getMax(String a, String b){
        int result = a.compareTo(b);
        if (result < 0){
            return b;
        }else {
            return a;
        }
    }
}
