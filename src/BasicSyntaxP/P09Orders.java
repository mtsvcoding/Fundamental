package BasicSyntaxP;

import java.util.Scanner;

public class P09Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ordersNum = Integer.parseInt(scanner.nextLine());
        int n = 0;

        double totalSum = 0;

        double[] checkArr = new double[ordersNum];

        while (n < ordersNum){
            double pricePerCapsules = Double.parseDouble(scanner.nextLine());
            int daysMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = (daysMonth*capsulesCount)* pricePerCapsules;
            totalSum += orderPrice;
            checkArr [n] = orderPrice;
//            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
            n++;
        }
        for (double v : checkArr) {

            System.out.printf("The price for the coffee is: $%.2f%n", v);
        }
        System.out.printf("Total: $%.2f", totalSum);


        //((daysInMonth * capsulesCount) * pricePerCapsule)
    }
}
