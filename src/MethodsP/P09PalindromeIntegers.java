package MethodsP;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            palindromeCheck(input);

            input = scanner.nextLine();
        }
    }

    private static void palindromeCheck (String a){
        String b="";
        char temp;

        for (int i=0; i<a.length(); i++)
        {
            temp= a.charAt(i);
            b= temp + b;
        }

        if(a.length() < 1 ){
            System.out.println("true");
        } else if (a.length() > 1) {
            if (a.equals(b)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
