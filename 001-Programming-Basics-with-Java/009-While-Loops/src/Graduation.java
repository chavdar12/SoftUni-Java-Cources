import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        double sum = 0;
        int excluded = 0;
        while (grade <= 12) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input >= 4.00) {
                sum += input;
                grade++;
            } else {
                excluded++;
                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    break;
                }
            }
        }
        if (grade == 13) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}
