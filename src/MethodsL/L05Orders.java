package MethodsL;

import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productInput = scanner.nextLine();
        int quality = Integer.parseInt(scanner.nextLine());

        switch (productInput){
            case "coffee":
                sumPrice(quality, 1.50);
                break;
            case "water":
                sumPrice(quality, 1.00);
                break;
            case "coke":
                sumPrice(quality, 1.40);
                break;
            case "snacks":
                sumPrice(quality, 2.00);
                break;
        }

    }
    public static void sumPrice (int firstParam, double secondParam){
        double sum = firstParam * secondParam;
        System.out.printf("%.2f", sum);
    }
}
