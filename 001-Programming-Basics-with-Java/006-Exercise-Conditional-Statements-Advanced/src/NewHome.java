import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flower) {
            case "Roses" -> {
                price = quantity * 5;
                if (quantity > 80) {
                    price *= 0.9;
                }
            }
            case "Dahlias" -> {
                price = quantity * 3.8;
                if (quantity > 90) {
                    price *= 0.85;
                }
            }
            case "Tulips" -> {
                price = quantity * 2.8;
                if (quantity > 80) {
                    price *= 0.85;
                }
            }
            case "Narcissus" -> {
                price = quantity * 3;
                if (quantity < 120) {
                    price *= 1.15;
                }
            }
            case "Gladiolus" -> {
                price = quantity * 2.5;
                if (quantity < 80) {
                    price *= 1.2;
                }
            }
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
