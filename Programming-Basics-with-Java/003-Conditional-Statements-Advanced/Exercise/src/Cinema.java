package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;
        switch (type) {
            case "Premiere" -> income = rows * columns * 12;
            case "Normal" -> income = rows * columns * 7.5;
            case "Discount" -> income = rows * columns * 5;
        }
        System.out.printf("%.2f leva", income);
    }
}
