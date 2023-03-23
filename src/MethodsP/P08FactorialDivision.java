package MethodsP;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());

        double result = factorial(firstInput) / factorial(secondInput);

        System.out.printf("%.2f", result);
    }

    private static double factorial (int a){

        double factorial = 1;
        for (int i = 1; i <= a ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
