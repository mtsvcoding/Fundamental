package ArraysL;

import java.util.Scanner;

public class L02PrintNumbersInReverseOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int [] numbersArr = new int[inputNum];

        for (int i = 0; i < inputNum; i++) {
            int inputData = Integer.parseInt(scanner.nextLine());

            numbersArr [i] = inputData;
        }

        for (int j = numbersArr.length - 1; j >= 0 ; j--) {
            System.out.print(numbersArr[j] + " ");
        }
    }
}
