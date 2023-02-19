package BasicSyntaxP;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int firstNum = inputNum;

        int sum = 0;

        while (inputNum > 0){
            int lastDigit = inputNum % 10;
            int fact = 1;

            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;

            }
            sum += fact;

            inputNum = inputNum / 10;
        }

        if (sum == firstNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
