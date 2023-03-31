package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result;
        switch (operator) {
            case "+" -> {
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", n1, n2, result);
                }
            }
            case "-" -> {
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", n1, n2, result);
                }
            }
            case "*" -> {
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", n1, n2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", n1, n2, result);
                }
            }
            case "/" -> {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                }
            }
            case "%" -> {
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                }
            }
        }
    }
}
