import java.util.Scanner;

public class ElementEqualToTheSumOfOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        if (sum - max == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max - max));
        }
    }
}
