import java.util.Scanner;

public class StudyMaterials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pencils = Double.parseDouble(scan.nextLine());
        double markers = Double.parseDouble(scan.nextLine());
        double detergent = Double.parseDouble(scan.nextLine());

        double pencilsPrice = pencils * 5.80;
        double markersPrice = markers * 7.20;
        double detergentPrice = detergent * 1.20;

        double totalPrice = pencilsPrice + markersPrice + detergentPrice;
        double discount = totalPrice * 0.1;
        double finalPrice = totalPrice - discount;

        System.out.printf("%.3f", finalPrice);
    }
}
