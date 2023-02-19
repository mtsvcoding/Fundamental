package BasicSyntaxM;

import java.util.Scanner;

public class M04ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        char [] outArr = inputText.toCharArray();

        for (int i = outArr.length-1; i >=0 ; i--) {
            System.out.print(outArr[i]);
        }


    }
}
