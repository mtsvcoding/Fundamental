package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

public class P02CommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstInputArr = scanner.nextLine().split(" ");
        String[] secondInputArr = scanner.nextLine().split(" ");


        for (int i = 0; i < secondInputArr.length; i++) {
          String temp = secondInputArr[i];
            for (int j = 0; j < firstInputArr.length; j++) {
                String newTemp = firstInputArr[j];
                if (newTemp.equals(temp)){
                    System.out.print(newTemp + " ");
                }
            }
        }

        System.out.println();

    }
}
