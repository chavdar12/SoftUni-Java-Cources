package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination;
        String typeOfVacation;
        double moneySpent;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = budget * 0.3;
                typeOfVacation = "Camp";
            } else {
                moneySpent = budget * 0.7;
                typeOfVacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneySpent = budget * 0.4;
                typeOfVacation = "Camp";
            } else {
                moneySpent = budget * 0.8;
                typeOfVacation = "Hotel";
            }
        } else {
            destination = "Europe";
            moneySpent = budget * 0.9;
            typeOfVacation = "Hotel";
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", typeOfVacation, moneySpent);
    }
}
