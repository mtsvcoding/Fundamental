package ArraysP;

import java.util.Scanner;

public class P01Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] passengerArr = new int[num];

        int sum = 0;

        for (int i = 0; i < num; i++) {
            int passengerNum = Integer.parseInt(scanner.nextLine());
            passengerArr[i] = passengerNum;
            sum += passengerNum;
        }

        for (int i : passengerArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
