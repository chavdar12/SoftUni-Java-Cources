package FirstStepsInCodingExersice.src;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        double volume = length * width * height;
        double liters = volume * 0.001;
        double percent = Double.parseDouble(scanner.nextLine());
        double percentLiters = percent * 0.01;
        double result = liters * (1 - percentLiters);
        System.out.printf("%.3f", result);
    }
}
