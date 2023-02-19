package ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class L03SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner   = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input [i] % 2 == 0) {
                sum += input[i];
            }
        }
        System.out.println(sum);
    }
}
