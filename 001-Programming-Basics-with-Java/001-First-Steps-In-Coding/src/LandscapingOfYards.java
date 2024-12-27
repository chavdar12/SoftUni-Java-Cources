import java.util.Scanner;

public class LandscapingOfYards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yardArea = Double.parseDouble(scan.nextLine());

        double pricePerSquareMeter = yardArea * 7.61;
        double discount = pricePerSquareMeter * 0.18;
        double finalPrice = pricePerSquareMeter - discount;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);
    }
}
