package ArraysP;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[input];
        String[] secondArr = new String[input];

        for (int i = 1; i <= input; i++) {
            String[] numbersInput = scanner.nextLine().split(" ");
            if (i % 2 != 0){
                firstArr[i-1] = numbersInput[0];
                secondArr[i-1] = numbersInput[1];
            }else {
                secondArr[i-1] = numbersInput[0];
                firstArr[i-1] = numbersInput[1];
            }
        }

        for (String i : firstArr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (String j : secondArr){
            System.out.print(j + " ");
        }

    }
}
