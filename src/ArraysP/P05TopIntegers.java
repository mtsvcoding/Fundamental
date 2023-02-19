package ArraysP;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int temp = 0;
        boolean isNotBigger = false;

        for (int i = 0; i < inputNumbers.length; i++) {

            if (isNotBigger){
                System.out.print(temp + " ");
            }

            int a = inputNumbers[i];
            if (i == inputNumbers.length - 1) {
                System.out.print(a);
                break;
            }

            for (int j = i + 1; j < inputNumbers.length; j++) {
                int b = inputNumbers[j];
                if (a > b) {
                    isNotBigger = true;
                    temp = a;
                }else {
                    isNotBigger = false;
                    temp = 0;
                    break;
                }

            }

        }
    }
}
