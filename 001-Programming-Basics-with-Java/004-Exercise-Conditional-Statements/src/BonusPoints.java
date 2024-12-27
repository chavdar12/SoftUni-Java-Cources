import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = Integer.parseInt(scanner.nextLine());
        double bonus;
        if (points <= 100) {
            bonus = 5;
        } else if (points > 1000) {
            bonus = points * 0.1;
        } else {
            bonus = points * 0.2;
        }

        if (points % 2 == 0) {
            bonus = bonus + 1;
        } else if (points % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(points + bonus);
    }
}
