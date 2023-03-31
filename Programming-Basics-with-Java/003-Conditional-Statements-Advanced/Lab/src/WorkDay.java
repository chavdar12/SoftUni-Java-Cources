package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedLab.src;

import java.util.Scanner;

public class WorkDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" -> {
                if (time >= 10 && time <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
            }
            default -> System.out.println("closed");
        }
    }
}
