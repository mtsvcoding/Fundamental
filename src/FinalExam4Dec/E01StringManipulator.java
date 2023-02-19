package FinalExam4Dec;

import java.util.Scanner;

public class E01StringManipulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        String command = scanner.next();

        while (!command.equals("End")){



            switch (command){
                case "Translate":
                    String oldValue = scanner.next();
                    String newValue = scanner.next();
                    String replaceString = inputText.replace(oldValue, newValue);
                    inputText = replaceString;
                    System.out.println(replaceString);
                    break;
                case "Includes":
                    String substring = scanner.next();
                    boolean isValid = inputText.contains(substring);
                    if (isValid){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String substring1 = scanner.next();
                    boolean isStart = inputText.startsWith(substring1);
                    if (isStart){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    String output = inputText.toLowerCase();
                    inputText = output;
                    System.out.println(output);
                    break;
                case "FindIndex":
                    String input = scanner.next();
                    int index = inputText.lastIndexOf(input);
                    System.out.println(index);
                    break;
                case "Remove":
                    int index1 = Integer.parseInt(scanner.next());
                    int index2 = Integer.parseInt(scanner.next());
                    int index3 = index1 + index2;
                    StringBuilder inputNew = new StringBuilder(inputText);
                    inputNew.delete(index1, index3);
                    inputText = String.valueOf(inputNew);
                    System.out.println(inputNew);
                    break;
            }



            command = scanner.next();
        }
    }
}
