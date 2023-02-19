package ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class L05EvenAndOddSubtraction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int[] inputNumberArr = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int oddSum = 0;
        int evenSum = 0;

        for (int j : inputNumberArr) {
            if (j % 2 != 0) {
                oddSum += j;
            } else {
                evenSum += j;
            }

        }
        System.out.print(evenSum - oddSum);
    }
}
