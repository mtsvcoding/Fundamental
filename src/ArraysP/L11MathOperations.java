package ArraysP;

import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculator(firstNum, secondNum, operator));


    }

    public static double calculator(int a, int b, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
            break;
            case "-":
                result = a - b;
            break;
            case "*":
                result = a * b;
            break;
            case "/":
                result = a / b;
            break;
        }
            return result;

    }
}
