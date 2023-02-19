package MethodsL;

import java.util.Scanner;

public class L01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int input = Integer.parseInt(scanner.nextLine());

       printNumSign(input);
    }
    public static void printNumSign (int parameter) {
        if (parameter < 0){
            System.out.printf("The number %d is negative.", parameter);
        } else if (parameter > 0) {
            System.out.printf("The number %d is positive.", parameter);
        }else {
            System.out.printf("The number %d is zero.", parameter);
        }
    }
}
