package FinalExam4Dec;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class E02MessageTranslator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {

            String commandInput = scanner.nextLine();
//            String [] commandArr = Arrays.stream (scanner.nextLine().split("!"))
//                    .filter (c -> c.startsWith(c.toUpperCase()))
//                    .toArray ();

            String [] commandArr = commandInput.split("'!'");




        }
    }
}
