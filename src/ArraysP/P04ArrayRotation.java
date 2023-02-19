package ArraysP;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int rotationNum = Integer.parseInt(scanner.nextLine());


            for(int i = 0; i < rotationNum; i++){
                String first;
                int j;
                //Stores the first element of the array
                first = inputArr[0];
                for(j = 0; j < inputArr.length-1; j++){
                    //Shift element of array by one
                    inputArr[j] = inputArr[j+1];
                }
                //First element of array will be added to the end
                inputArr[j] = first;
            }

            for (String i : inputArr){
                System.out.print(i + " ");
            }
    }
}
