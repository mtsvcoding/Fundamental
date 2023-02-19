package BasicSyntaxL;

import java.util.Scanner;

public class L07TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        int ticketPrice = 0;
        boolean validAge = true;

        switch (day){
            case "weekday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                }else {
                    validAge = false;
                }
                break;

            case "weekend":
                if (age >= 0 && age <= 18){
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                }else {
                    validAge = false;
                }
                break;

            case "holiday":
                if (age >= 0 && age <= 18){
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                }else {
                    validAge = false;
                }
                break;
        }
        if (validAge){
            System.out.printf("%d$", ticketPrice);
        }else {
            System.out.println("Error!");
        }

    }
}
