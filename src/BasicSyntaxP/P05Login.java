package BasicSyntaxP;

import java.util.Scanner;

public class P05Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputUser = scanner.nextLine();
        String passwordInput = scanner.nextLine();

        StringBuilder password = new StringBuilder();

        for (int i = inputUser.length()-1; i >= 0 ; i--) {
            password.append(inputUser.charAt(i));
        }

        int counter = 0;
        boolean attemptLimit = false;

        while (!passwordInput.contentEquals(password)){
                counter ++;
            if (counter > 3){
                attemptLimit = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");

            passwordInput = scanner.nextLine();


        }
        if (attemptLimit) {
            System.out.printf("User %s blocked!", inputUser);
        }else {
            System.out.printf("User %s logged in.", inputUser);
        }

    }

}

