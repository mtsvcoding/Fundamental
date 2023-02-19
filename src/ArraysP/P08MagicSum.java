package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {
            int num = inputArr[i];
            for (int j = i+1; j < inputArr.length ; j++) {
                int num2 = inputArr[j];
                if (magicSum == num + num2){
                    System.out.print(num + " " + num2);
                    System.out.println();
                }
            }
        }
    }
}
