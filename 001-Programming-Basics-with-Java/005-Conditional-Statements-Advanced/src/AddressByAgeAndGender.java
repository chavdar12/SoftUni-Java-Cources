import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        switch (gender) {
            case "f" -> {
                if (age >= 16) {
                    System.out.println("Ms.");
                } else {
                    System.out.println("Miss");
                }
            }
            case "m" -> {
                if (age >= 16) {
                    System.out.println("Mr.");
                } else {
                    System.out.println("Master");
                }
            }
        }
    }
}
