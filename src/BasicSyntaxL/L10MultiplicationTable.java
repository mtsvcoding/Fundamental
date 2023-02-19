package BasicSyntaxL;

import java.util.Scanner;

public class L10MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            int result = inputNum * i;
            System.out.printf("%d X %d = %d %n", inputNum, i, result);

        }
    }
}
