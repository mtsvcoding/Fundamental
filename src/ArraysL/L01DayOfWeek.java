package ArraysL;

import java.util.Scanner;

public class L01DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayNum = Integer.parseInt(scanner.nextLine());

        String [] dayOfWeekArr = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNum >0 && dayNum <= 7){
            System.out.println(dayOfWeekArr[dayNum - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
