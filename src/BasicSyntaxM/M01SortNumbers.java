package BasicSyntaxM;

import java.util.Scanner;

public class M01SortNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int temp = 0;

        int [] inputArr = new int[3];
                inputArr[0] = a;
                inputArr[1] = b;
                inputArr[2] = c;


        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i+1; j < inputArr.length; j++) {
                if(inputArr[i] < inputArr[j]) {
                    temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }


        System.out.println(inputArr[0]);
        System.out.println(inputArr[1]);
        System.out.println(inputArr[2]);

    }
}
