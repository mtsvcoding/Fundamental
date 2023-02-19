package ArraysL;

import java.util.Arrays;
import java.util.Scanner;

public class L06EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstInputArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int[] secondInputArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int sum = 0;
        int currentIndex = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstInputArr.length; i++) {
            int firstNum = firstInputArr[i];
            int secondNum = secondInputArr[i];


            if (firstNum == secondNum){
                sum += firstNum;
            }else {
                currentIndex = i;
                isIdentical = false;
                break;
            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", currentIndex);
        }
    }
}
