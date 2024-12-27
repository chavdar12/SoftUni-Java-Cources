import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scan.nextLine());
        int fishMenu = Integer.parseInt(scan.nextLine());
        int vegetarianMenu = Integer.parseInt(scan.nextLine());

        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegetarianPrice = vegetarianMenu * 8.15;

        double total = chickenPrice + fishPrice + vegetarianPrice;
        double desert = total * 0.20;
        double delivery = 2.50;
        double finalPrice = total + desert + delivery;

        System.out.printf("%.2f", finalPrice);
    }
}
