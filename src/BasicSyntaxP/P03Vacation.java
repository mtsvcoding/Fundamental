package BasicSyntaxP;

import java.util.Scanner;

public class P03Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numPersons = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();


        double totalPrice = 0;

        switch (day){
            case "Friday":
                switch (groupType) {
                    case "Students":
                        totalPrice = numPersons * 8.45;
                        if (numPersons >= 30) {
                            totalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                        case "Business":
                            totalPrice = numPersons * 10.90;
                            if (numPersons >= 100) {
                                totalPrice = totalPrice - (10 * 10.90);
                            }
                            break;
                            case "Regular":
                                totalPrice = numPersons * 15;
                                if (numPersons >= 10 && numPersons <= 20) {
                                    totalPrice = totalPrice - (totalPrice * 0.05);
                                }
                                break;
                            }
                break;

            case "Saturday":
                switch (groupType) {
                    case "Students":
                        totalPrice = numPersons * 9.80;
                        if (numPersons >= 30) {
                            totalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                    case "Business":
                        totalPrice = numPersons * 15.60;
                        if (numPersons >= 100) {
                            totalPrice = totalPrice - (10 * 15.60);
                        }
                        break;
                    case "Regular":
                        totalPrice = numPersons * 20;
                        if (numPersons >= 10 && numPersons <= 20) {
                            totalPrice = totalPrice - (totalPrice * 0.05);
                        }
                        break;
                }
                break;

            case "Sunday":
                switch (groupType) {
                    case "Students":
                        totalPrice = numPersons * 10.46;
                        if (numPersons >= 30) {
                            totalPrice = totalPrice - (totalPrice * 0.15);
                        }
                        break;
                    case "Business":
                        totalPrice = numPersons * 16;
                        if (numPersons >= 100) {
                            totalPrice = totalPrice - (10 * 16);
                        }
                        break;
                    case "Regular":
                        totalPrice = numPersons * 22.50;
                        if (numPersons >= 10 && numPersons <= 20) {
                            totalPrice = totalPrice - (totalPrice * 0.05);
                        }
                        break;
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
