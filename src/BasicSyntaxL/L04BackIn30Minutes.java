package BasicSyntaxL;

import java.util.Scanner;

public class L04BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hour * 60 + minutes + 30;

        int finalHour = time / 60;
        int finalMinutes = time % 60;

        if (finalHour > 23){
            finalHour = 0;
        }


            System.out.print(finalHour + ":");


        if (finalMinutes >= 0 && finalMinutes < 10) {
            System.out.print("0" + finalMinutes);
        }else {
            System.out.print(finalMinutes);
        }
    }
}
