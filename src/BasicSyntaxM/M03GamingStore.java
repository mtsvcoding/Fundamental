package BasicSyntaxM;

import java.util.Scanner;

public class M03GamingStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double restBudget = budget;
        double totalSpend = 0;
        boolean enoughMoney = true;

        while (!input.equals("Game Time")){


            switch (input){
                case "OutFall 4":
                    if (39.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 39.99;
                    System.out.println("Bought OutFall 4");
                    totalSpend += 39.99;
                    break;
                case "CS: OG":
                    if (15.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 15.99;
                    System.out.println("Bought CS: OG");
                    totalSpend += 15.99;
                    break;
                case "Zplinter Zell":
                    if (19.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 19.99;
                    System.out.println("Bought Zplinter Zell");
                    enoughMoney = false;
                    totalSpend += 19.99;
                    break;
                case "Honored 2":
                    if (59.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 59.99;
                    System.out.println("Bought Honored 2");
                    totalSpend += 59.99;
                    break;
                case "RoverWatch":
                    if (29.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 29.99;
                    System.out.println("Bought RoverWatch");
                    totalSpend += 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    if (39.99 > restBudget){
                        System.out.println("Too Expensive");
                        break;
                    }
                    restBudget = restBudget - 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                    totalSpend += 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (restBudget <= 0){
                enoughMoney = false;
                break;
            }else {
                input = scanner.nextLine();
            }

        }
        if (!enoughMoney){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, restBudget);
        }


    }
}
