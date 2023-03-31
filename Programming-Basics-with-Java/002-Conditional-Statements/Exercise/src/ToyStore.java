package ConditionalStatements.ConditionalStatementsExercise.src;

import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfExcursion = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numberOfBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());

        double totalNumberOfToys = numberOfPuzzles + numberOfDolls + numberOfBears + numberOfMinions + numberOfTrucks;
        double totalSum = numberOfPuzzles * 2.60 + numberOfDolls * 3 + numberOfBears * 4.10 + numberOfMinions * 8.20 + numberOfTrucks * 2;

        if (totalNumberOfToys >= 50) {
            totalSum = totalSum - totalSum * 0.25;
        }

        totalSum = totalSum - totalSum * 0.10;

        if (totalSum >= priceOfExcursion) {
            System.out.printf("Yes! %.2f lv left.", totalSum - priceOfExcursion);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceOfExcursion - totalSum);
        }
    }
}
