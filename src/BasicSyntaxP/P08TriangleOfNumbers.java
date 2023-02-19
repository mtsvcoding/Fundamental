package BasicSyntaxP;

import java.util.Scanner;

public class P08TriangleOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        int i, j;
        for(i=1; i<= inputNum; i++) {
            for(j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

