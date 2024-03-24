package WhileLoop.WhileLoopLab.src;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String input = scanner.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double money = Double.parseDouble(input);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", money);
            total += money;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
