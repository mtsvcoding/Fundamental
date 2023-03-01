package MethodsP;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = charFromScan(scanner);
        int secondInput = charFromScan(scanner);

        System.out.println(getChar(firstInput, secondInput));
    }
    public static int charFromScan (Scanner scanner){
        String input = scanner.nextLine();

        return input.charAt(0);
    }

    public static String getChar (int a, int b) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        if (a < b) {

            for (int i = a + 1; i < b; i++) {
                char as = (char) i;
                sb.append(as);
                sb.append(" ");
                temp = sb.toString();
            }
        } else {

            for (int i = b + 1; i < a; i++) {
                char as = (char) i;
                sb.append(as);
                sb.append(" ");
                temp = sb.toString();
            }
        }
        return temp;
    }
}
