package BasicSyntaxL;

import java.util.Scanner;

public class L11MultiplicationTable2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10){
            int product = inputNum * multiplier;
            System.out.printf("%d X %d = %d", inputNum, multiplier, product);
        }else {
            for (int i = multiplier; i <= 10 ; i++) {
                int product = inputNum * i;
                System.out.printf("%d X %d = %d %n", inputNum, i, product);
            }
        }
    }
}
