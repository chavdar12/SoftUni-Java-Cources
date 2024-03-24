package FirstStepsInCodingLab.src;

import java.util.Scanner;

public class ConcatenateText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        String age = scan.nextLine();
        String town = scan.nextLine();
        System.out.printf("You are %s %s, a %s-years old person from %s.", firstName, lastName, age, town);
    }
}
