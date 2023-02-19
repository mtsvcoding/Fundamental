package ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class L07CondenseArrayToNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] inputArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] newArr = new int[inputArr.length - 1];

        for (int i = inputArr.length- 1; i > 0 ; i--) {

            for (int j = 0; j <= i -1 ; j++) {
                newArr[j] = inputArr[j] + inputArr[j + 1];
            }
            int [] condensedArr = new int[newArr.length-1];

            inputArr = newArr ;
            newArr = condensedArr;

        }
        System.out.println(inputArr[0]);
    }
}
