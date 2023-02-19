package BasicSyntaxP;

import java.util.Scanner;

public class P02Division {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int dividerArr [] = {2, 3, 6, 7, 10};

        int divider = 0;
        boolean isDivisible = true;

        for (int i = 0; i < dividerArr.length; i++) {

            int result = inputNum % dividerArr[i];
                if (result == 0){
                    divider = dividerArr [i];
                }
        }
            if (divider == 0){
                isDivisible = false;
                System.out.println("Not divisible");
             }else {
                System.out.printf("The number is divisible by %d", divider);
            }


    }
}
