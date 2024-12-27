import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int money = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += i * 5 - 1;
            } else {
                toys++;
            }
        }
        double totalMoney = money + toys * toyPrice;
        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalMoney);
        }
    }
}
