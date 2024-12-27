import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceOfClothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothes = extras * priceOfClothes;
        if (extras > 150) {
            clothes = clothes * 0.9;
        }
        double total = decor + clothes;
        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
