package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        while (change > 0) {
            if (change >= 2) {
                change -= 2;
                coins++;
            } else if (change >= 1) {
                change -= 1;
                coins++;
            } else if (change >= 0.50) {
                change -= 0.50;
                coins++;
            } else if (change >= 0.20) {
                change -= 0.20;
                coins++;
            } else if (change >= 0.10) {
                change -= 0.10;
                coins++;
            } else if (change >= 0.05) {
                change -= 0.05;
                coins++;
            } else if (change >= 0.02) {
                change -= 0.02;
                coins++;
            } else if (change >= 0.01) {
                change -= 0.01;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
