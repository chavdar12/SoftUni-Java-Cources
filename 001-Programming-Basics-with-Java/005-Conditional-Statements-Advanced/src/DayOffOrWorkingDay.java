import java.util.Scanner;

public class DayOffOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
