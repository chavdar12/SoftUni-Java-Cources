package FirstStepsInCodingExersice.src;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int thinner = Integer.parseInt(scan.nextLine());

        double nylonPrice = nylon * 1.50;
        double paintPrice = paint * 14.50;
        double thinnerPrice = thinner * 5.00;

        double total = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double discount = total * 0.10;
        double finalPrice = total - discount;

        System.out.printf("%.3f", finalPrice);
    }
}
