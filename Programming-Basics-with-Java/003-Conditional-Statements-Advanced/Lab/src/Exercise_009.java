package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class Exercise_009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();

        String opinion = scanner.nextLine();
        int nights = days - 1;
        double price = 0.0;
        switch (roomType) {
            case "room for one person" -> price = nights * 18;
            case "apartment" -> {
                price = nights * 25;
                if (nights < 10) {
                    price *= 0.7;
                } else if (nights <= 15) {
                    price *= 0.65;
                } else {
                    price *= 0.5;
                }
            }
            case "president apartment" -> {
                price = nights * 35;
                if (nights < 10) {
                    price *= 0.9;
                } else if (nights <= 15) {
                    price *= 0.85;
                } else {
                    price *= 0.8;
                }
            }
        }
        if (opinion.equals("negative")) {
            price *= 0.9;
        } else {
            price *= 1.25;
        }
        System.out.printf("%.2f", price);
    }
}
