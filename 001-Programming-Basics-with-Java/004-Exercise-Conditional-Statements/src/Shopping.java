import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videoCardPrice = 250;
        double processorPrice = videoCardPrice * 0.35;
        double ramPrice = videoCardPrice * 0.1;
        double total = videoCards * videoCardPrice + processors * processorPrice + ram * ramPrice;
        if (videoCards > processors) {
            total = total * 0.85;
        }
        if (total <= budget) {
            System.out.printf("You have %.2f leva left!", budget - total);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", total - budget);
        }
    }
}
