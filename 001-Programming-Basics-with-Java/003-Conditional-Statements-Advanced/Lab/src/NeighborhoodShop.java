package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class NeighborhoodShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (city) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> price = 0.50;
                    case "water" -> price = 0.80;
                    case "beer" -> price = 1.20;
                    case "sweets" -> price = 1.45;
                    case "peanuts" -> price = 1.60;
                }
            }
            case "Plovdiv" -> {
                switch (product) {
                    case "coffee" -> price = 0.40;
                    case "water" -> price = 0.70;
                    case "beer" -> price = 1.15;
                    case "sweets" -> price = 1.30;
                    case "peanuts" -> price = 1.50;
                }
            }
            case "Varna" -> {
                switch (product) {
                    case "coffee" -> price = 0.45;
                    case "water" -> price = 0.70;
                    case "beer" -> price = 1.10;
                    case "sweets" -> price = 1.35;
                    case "peanuts" -> price = 1.55;
                }
            }
        }
        System.out.println(price * quantity);
    }
}
