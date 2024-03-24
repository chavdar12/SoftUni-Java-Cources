package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForTrip = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spendDays = 0;
        while (moneyAvailable < moneyForTrip) {
            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            days++;
            if (action.equals("spend")) {
                spendDays++;
                moneyAvailable -= money;
                if (moneyAvailable < 0) {
                    moneyAvailable = 0;
                }
            } else if (action.equals("save")) {
                spendDays = 0;
                moneyAvailable += money;
            }
            if (spendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }
        }
        if (moneyAvailable >= moneyForTrip) {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
