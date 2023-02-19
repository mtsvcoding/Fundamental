package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual = true;

        if (inputArr.length == 1){
            System.out.print("0");
            isEqual = false;
        }else {
            for (int i = 0; i < inputArr.length; i++) {
                if (!isEqual){
                    break;
                }
                rightSum = 0;
                if (i != 0){
                    leftSum += inputArr[i - 1];
                }
                for (int j = i+1; j < inputArr.length ; j++) {
                    rightSum += inputArr[j];
                    if (rightSum == leftSum && j == inputArr.length-1){
                        isEqual = false;
                        System.out.print(i);
                        break;
                    }
                }

            }
        }

        if (isEqual){
            System.out.print("no");
        }
    }
}
