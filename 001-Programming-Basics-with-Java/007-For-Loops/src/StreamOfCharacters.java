import java.util.Scanner;

public class StreamOfCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            System.out.println(currentChar);
        }
    }
}
