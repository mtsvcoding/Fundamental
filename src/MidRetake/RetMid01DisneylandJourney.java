package MidRetake;

import java.util.Scanner;

public class RetMid01DisneylandJourney {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double needBidget = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 0; i <= months; i++) {
            if (i != 1 && i % 2 != 0){
                sum = sum - (sum * 0.16);
            }
            if (i % 4 == 0){
                sum = sum + (sum * 0.25);
            }
            double percent = needBidget * 0.25;
            if (i != 0){
                sum += percent;
            }
        }
        double diff = Math.abs(needBidget - sum);
        if (sum >= needBidget){
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", diff);
        }else {
            System.out.printf("Sorry. You need %.2flv. more.", diff);
        }
    }
}
