package MethodsL;

import java.util.Scanner;

public class L02Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGradeWord(grade);
    }
    public static void printGradeWord (Double parameter){
        if (parameter <= 6 && parameter >= 5.50){
            System.out.println("Excellent");
        } else if (parameter >= 4.50) {
            System.out.println("Very good");
        } else if (parameter >= 3.50) {
            System.out.println("Good");
        } else if (parameter >= 3.00) {
            System.out.println("Poor");
        }else {
            System.out.println("Fail");
        }

    }
}
