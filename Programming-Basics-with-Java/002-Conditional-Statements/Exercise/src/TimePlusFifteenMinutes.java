package ConditionalStatements.ConditionalStatementsExercise.src;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int sum = hours * 60 + minutes + 15;
        int newHours = sum / 60;
        int newMinutes = sum % 60;
        if (newHours == 24) {
            newHours = 0;
        }
        if (newMinutes < 10) {
            System.out.printf("%d:0%d", newHours, newMinutes);
        } else {
            System.out.printf("%d:%d", newHours, newMinutes);
        }
    }
}
