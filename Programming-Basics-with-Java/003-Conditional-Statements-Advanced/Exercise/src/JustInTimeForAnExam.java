package ConditionalStatementsAdvansed.ConditionalStatementsAdvancedExercise.src;

import java.util.Scanner;

public class JustInTimeForAnExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = examTime - arrivalTime;
        if (difference < 0) {
            System.out.println("Late");
            if (difference >= -59) {
                System.out.printf("%d minutes after the start", Math.abs(difference));
            } else {
                int hours = Math.abs(difference) / 60;
                int minutes = Math.abs(difference) % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (difference <= 30) {
            System.out.println("On time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {
            System.out.println("Early");
            if (difference <= 59) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }
    }
}
