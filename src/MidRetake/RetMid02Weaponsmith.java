package MidRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RetMid02Weaponsmith {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> weapon = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            if (command.startsWith("Add")) {
                List<String> add = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                String particle = add.get(1);
                int index = Integer.parseInt(add.get(2));
                if (index >= 0 && index < weapon.size()) {
                    weapon.add(index, particle);
                }
            } else if (command.startsWith("Remove")) {
                if (command.startsWith("Remove")) {
                    List<String> rem = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                    int index = Integer.parseInt(rem.get(1));
                    if (index >= 0 && index < weapon.size()) {
                        weapon.remove(index);
                    }
                }
            }

            if (command.equals("Check Even")) {
                for (int i = 0; i < weapon.size(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(weapon.get(i) + " ");
                    }
                }

            } else if (command.equals("Check Odd")) {
                for (int i = 0; i < weapon.size(); i++) {
                    if (i % 2 != 0) {
                        System.out.print(weapon.get(i) + " ");
                    }
                }

            }

            command = scanner.nextLine();
        }
        System.out.println();
        String output = String.join("", weapon);
        System.out.printf("You crafted %s!", output);
    }
}

