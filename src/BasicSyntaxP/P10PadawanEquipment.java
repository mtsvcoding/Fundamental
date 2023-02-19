package BasicSyntaxP;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class P10PadawanEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSaberCost = lightSabersPrice * Math.ceil(studentCount + studentCount * 0.10);
        double robesCost = studentCount * robesPrice;
        double beltCost = 0;
        if (studentCount > 5){
            beltCost = beltPrice * (studentCount - (studentCount / 6));
        }else {
            beltCost = beltPrice * studentCount;
        }

        double total = lightSaberCost + robesCost + beltCost;
        double diff = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }



    }
}