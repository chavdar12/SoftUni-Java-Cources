package FirstStepsInCodingExersice.src;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit = Double.parseDouble(scan.nextLine());
        int months = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double result = deposit + months * ((deposit * percent / 100) / 12);
        System.out.println(result);
    }
}