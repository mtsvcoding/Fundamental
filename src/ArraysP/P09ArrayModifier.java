package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int pos1 = inputArr[index1];
                int pos2 = inputArr[index2];
                inputArr[index1] = pos2;
                inputArr[index2] = pos1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int pos1 = inputArr[index1];
                int pos2 = inputArr[index2];
                int sum = pos1 * pos2;
                inputArr[index1] = sum;

            } else if (command.contains("decrease")) {
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] = inputArr[i] - 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < inputArr.length; i++) {
            if(i != inputArr.length- 1){
                System.out.print(inputArr[i] + ", ");
            }else {
                System.out.print(inputArr[i]);
            }
        }
    }
}
