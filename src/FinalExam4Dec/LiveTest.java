package FinalExam4Dec;

import java.util.Scanner;

public class LiveTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int a = 5;
        int b = ++a;
        int c = a++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
