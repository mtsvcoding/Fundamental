package FinalExam4Dec;

import java.util.HashMap;
import java.util.Scanner;

public class FER03BakeryShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.startsWith("Complete")){
            if (input.startsWith("Receive")){
                String[] receiveArr = input.split(" ");
                int quantity = Integer.parseInt(receiveArr[1]);
                String foodType = receiveArr[2];
                HashMap<String, Integer> stock = new HashMap<>();


            } else if (input.startsWith("Sell")) {
                String[] sellArr = input.split(" ");
                int quantity = Integer.parseInt(sellArr[1]);
                String foodType = sellArr[2];
            }

            input = scanner.nextLine();
        }

    }
}
