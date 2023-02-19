package MethodsL;

import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String command = scanner.nextLine();
       int firstNum = Integer.parseInt(scanner.nextLine());
       int secondNum = Integer.parseInt(scanner.nextLine());

       switch (command){
           case "add":
               addTwoNumbs(firstNum,secondNum);
               break;
           case "subtract":
               subtractTwoNumbs(firstNum,secondNum);
               break;
           case "multiply":
               multiplyTwoNumbs(firstNum,secondNum);
               break;
           case "divide":
               divideTwoNumbs(firstNum,secondNum);
               break;
           default:
               System.out.println("Fuck off!");
               break;
       }

    }

    public static void addTwoNumbs (int par1, int par2){
        System.out.println(par1 + par2);
    }
    public static void subtractTwoNumbs (int par1, int par2){
        System.out.println(par1 - par2);
    }
    public static void multiplyTwoNumbs (int par1, int par2){
        System.out.println(par1 * par2);
    }
    public static void divideTwoNumbs (int par1, int par2){
        System.out.println(par1 / par2);
    }
}
