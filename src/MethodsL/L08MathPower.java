package MethodsL;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double resulNum = mathPower(num,power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(resulNum));

    }
    public static double mathPower (double num,double power){
        double result = 1;
        for (int i = 1; i <= power ; i++) {
            result = result * num;
        }
        return result;
    }
}
