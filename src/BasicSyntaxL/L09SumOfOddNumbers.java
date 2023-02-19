package BasicSyntaxL;

import java.util.Scanner;

public class L09SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int oddNum = 0;
        int sum = 0;


        for (int i = 0; i < inputNum ; i++) {
            if (i == 0){
                oddNum += 1;
                sum = oddNum;
            }else {
                oddNum += 2;
                sum = sum + oddNum;
            }
            System.out.println(oddNum);
        }
        System.out.printf("Sum: %d", sum);
    }
}
