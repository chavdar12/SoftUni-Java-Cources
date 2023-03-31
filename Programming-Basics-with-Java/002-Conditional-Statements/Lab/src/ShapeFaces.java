package ConditionalStatements.ConditionalStatementsLab.src;

import java.util.Scanner;

public class ShapeFaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area;
        switch (figure) {
            case "square" -> {
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                System.out.printf("%.3f", area);
            }
            case "rectangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
                System.out.printf("%.3f", area);
            }
            case "circle" -> {
                double r = Double.parseDouble(scanner.nextLine());
                area = Math.PI * r * r;
                System.out.printf("%.3f", area);
            }
            case "triangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                area = (a * h) / 2;
                System.out.printf("%.3f", area);
            }
        }
    }
}
