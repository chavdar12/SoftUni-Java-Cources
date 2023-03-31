package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double price = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };
        if (fishermen <= 6) {
            price *= 0.9;
        } else if (fishermen <= 11) {
            price *= 0.85;
        } else {
            price *= 0.75;
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price *= 0.95;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
