package MethodsP;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getInput(scanner.nextLine());
        int b = getInput(scanner.nextLine());
        int c = getInput(scanner.nextLine());

        System.out.println(smallestOfThreeNumbs(a, b, c));

    }
    public static int getInput (String a){
        return Integer.parseInt(a);
    }

    public static int smallestOfThreeNumbs (int a, int b, int c){
        return Math.min(c, (Math.min(a, b)));
    }
}
