package ArraysL;

import java.util.Scanner;

public class L04ReverseArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] inputArr = input.split (" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String current = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = current;

        }

        for (String s : inputArr) {
            System.out.print(s + " ");
        }

    }
}
