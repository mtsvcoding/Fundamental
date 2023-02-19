package MethodsL;

import java.util.Arrays;
import java.util.Scanner;

public class L01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        printArr(input);

    }
    public static void printArr (int[] name) {
        for (int i = 0; i < name.length ; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
