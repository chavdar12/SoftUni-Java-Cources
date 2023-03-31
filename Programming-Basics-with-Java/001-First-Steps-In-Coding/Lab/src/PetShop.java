package FirstStepsInCodingLab.src;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFood = Integer.parseInt(scan.nextLine());
        int catFood = Integer.parseInt(scan.nextLine());

        double totalSum = (dogFood * 2.50) + (catFood * 4.00);

        System.out.printf("%.2f lv.", totalSum);
    }
}
