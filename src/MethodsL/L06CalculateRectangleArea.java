package MethodsL;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double widthInput = Double.parseDouble(scanner.nextLine());
        double heightInput = Double.parseDouble(scanner.nextLine());

        double area = rectangularArea(widthInput, heightInput);

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(area));

    }
    public static double rectangularArea (double a, double b){
        return a * b;
    }
}
