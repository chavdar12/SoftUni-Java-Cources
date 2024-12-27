import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.50;
                    case "apple" -> price = 1.20;
                    case "orange" -> price = 0.85;
                    case "grapefruit" -> price = 1.45;
                    case "kiwi" -> price = 2.70;
                    case "pineapple" -> price = 5.50;
                    case "grapes" -> price = 3.85;
                }
            }
            case "Saturday", "Sunday" -> {
                switch (fruit) {
                    case "banana" -> price = 2.70;
                    case "apple" -> price = 1.25;
                    case "orange" -> price = 0.90;
                    case "grapefruit" -> price = 1.60;
                    case "kiwi" -> price = 3.00;
                    case "pineapple" -> price = 5.60;
                    case "grapes" -> price = 4.20;
                }
            }
        }
        if (price == 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", price * quantity);
        }
    }
}
