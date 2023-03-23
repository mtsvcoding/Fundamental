package MethodsP;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        matrix(input);
    }

    private static void matrix (int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
