package MethodsP;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toLowerCase();

        System.out.println(vowelsInString(input));

    }
    public static int vowelsInString (String a){
        int vCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' ||
               a.charAt(i) == 'e' ||
               a.charAt(i) == 'i' ||
               a.charAt(i) == 'o' ||
               a.charAt(i) == 'u') {
                vCount ++;
            }
        }
        return vCount;
    }
}
