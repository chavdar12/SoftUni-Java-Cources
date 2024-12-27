import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = Double.parseDouble(scan.nextLine());
        double sneakers = tax * 0.6;
        double equipment = sneakers * 0.8;
        double ball = equipment * 0.25;
        double accessories = ball * 0.2;
        double total = tax + sneakers + equipment + ball + accessories;
        System.out.printf("%.2f", total);
    }
}
