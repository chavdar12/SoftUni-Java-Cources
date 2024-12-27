import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch (currentChar) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }
        System.out.println(sum);
    }
}
