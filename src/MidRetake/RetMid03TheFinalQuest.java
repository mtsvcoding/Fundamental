package MidRetake;

import java.util.*;
import java.util.stream.Collectors;

public class RetMid03TheFinalQuest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            if (command.startsWith("Delete")) {
                List<String> del = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                int index = Integer.parseInt(del.get(1));
                index +=1;
                if (index >= 0 && index < input.size()) {
                    input.remove(index);
                }
            } else if (command.startsWith("Swap")) {
                List<String> swap = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                String word1 = swap.get(1);
                String word2 = swap.get(2);
                if (input.contains(word1) && input.contains(word2)) {
                    int index1 = input.indexOf(word1);
                    int index2 = input.indexOf(word2);
                    input.set(index1, word2);
                    input.set(index2, word1);
                }
            } else if (command.startsWith("Put")) {
                List<String> put = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                String word1 = put.get(1);
                int index = Integer.parseInt(put.get(2));
                if (index > 0 && index <= input.size()) {
                    index -= 1;
                    input.set(index, word1);
                }
            } else if (command.startsWith("Replace")) {
                List<String> rep = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                String word1 = rep.get(1);
                String word2 = rep.get(2);
                if (input.contains(word2)){
                    int index = input.indexOf(word2);
                    input.set(index, word1);
                }


            }
            if (command.equals("Sort")) {
                Collections.sort(input);
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", input));
    }

}
