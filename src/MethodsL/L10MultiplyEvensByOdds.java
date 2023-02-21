package MethodsL;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] data = input.replaceAll("-", "").split("");


        int[] inputData = new int[data.length];
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = Integer.parseInt(data[i]);
        }

        System.out.println(getResultMultiply(inputData));

    }

    public static int getEvenNumFromArr (int[] a){
        int result = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                result += Math.abs(j);
            }
        }
        return result;
    }

    public static int getOddNumFromArr (int[] a) {
        int result = 0;
        for (int j : a) {
            if (j % 2 != 0) {
                result += j;
            }
        }
        return result;
    }

    public static int getResultMultiply (int[] n){
        int evenSum = getEvenNumFromArr(n);
        int oddSum = getOddNumFromArr(n);
        return evenSum * oddSum;
    }
}
