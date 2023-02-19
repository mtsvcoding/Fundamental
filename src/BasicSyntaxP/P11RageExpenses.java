package BasicSyntaxP;

import java.util.Scanner;

public class P11RageExpenses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());



            int headsetCounter = gameCount / 2;
            int mouseCounter = gameCount / 3;
            int keyboardCounter = gameCount / 6;
            int displayCounter = gameCount / 12;


            double headsetCost = headsetPrice * headsetCounter;
            double mouseCost = mousePrice * mouseCounter;
            double keyboardCost = keyboardPrice * keyboardCounter;
            double displayCost = displayPrice * displayCounter;

            double total = headsetCost + mouseCost + keyboardCost + displayCost;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
