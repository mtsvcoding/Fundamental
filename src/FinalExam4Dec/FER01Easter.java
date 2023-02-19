package FinalExam4Dec;

import java.text.spi.BreakIteratorProvider;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FER01Easter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        String command = scanner.nextLine();

         while (!command.equals("Easter")){
             if(command.startsWith("Replace")){
                 String[] input= inputText.split("");
                 String[] rep = command.split(" ");
                 String currentChar = rep[1];
                 String newChar = rep[2];
                 for (int i = 0; i < inputText.length() ; i++) {
                     if (input[i].equals(currentChar)){
                         input[i] = newChar;
                     }
                 }
             inputText = String.join("", input);
                 System.out.println(inputText);

             } else if (command.startsWith("Remove")) {
//                 List<String> input = Arrays.stream(inputText.split(" ")).collect(Collectors.toList());
                 String[] rem = command.split(" ");
                 String substring = rem[1];
                 if (inputText.contains(substring)){
                     String output = inputText.replace(substring, "");
                     inputText = output;
                     System.out.println(output);
                 }else{
                     System.out.println(inputText);
                 }
             } else if (command.startsWith("includes")) {
                 String[] inc = command.split(" ");
                 String substring = inc[1];
                 if (inputText.contains(substring)){
                     System.out.println("True");
                 }else {
                     System.out.println("False");
                 }
             } else if (command.startsWith("Change")) {
                 String[] cha = command.split(" ");
                 String index = cha[1];
                 if (index.equals("Lower")){
                     inputText = inputText.toLowerCase();
                     System.out.println(inputText);
                 } else if (index.equals("Upper")) {
                     inputText = inputText.toUpperCase();
                     System.out.println(inputText);
                 }
             } else if (command.startsWith("Reverse")) {
                 String[] input= inputText.split("");
                 String[] rev = command.split(" ");
                 int index1 = Integer.parseInt(rev[1]);
                 int index2 = Integer.parseInt(rev[2]);
                 if (index2 < input.length){
                     for (int i = index2; i >=index1  ; i--) {
                         System.out.print(input[i]);
                     }
                 }

             }


             command = scanner.nextLine();
         }
    }
}
