package BasicSyntaxP;

import java.util.Scanner;

public class P07VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumCoins = 0;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if(coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2 ){
            sumCoins += coins;
            }else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")){
            String product = input;
            switch (product){
                case "Nuts":
                    if (sumCoins >= 2){
                        sumCoins -= 2;
                        System.out.println("Purchased Nuts");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Water":
                    if (sumCoins >= 0.7){
                        sumCoins -= 0.7;
                        System.out.println("Purchased Water");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Crisps":
                    if (sumCoins >= 1.5){
                        sumCoins -= 1.5;
                        System.out.println("Purchased Crisps");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Soda":
                    if (sumCoins >= 0.8){
                        sumCoins -= 0.8;
                        System.out.println("Purchased Soda");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Coke":
                    if (sumCoins >= 1){
                        sumCoins -= 1;
                        System.out.println("Purchased Coke");
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
