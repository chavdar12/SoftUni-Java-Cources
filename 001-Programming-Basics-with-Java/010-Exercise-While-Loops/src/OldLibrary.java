package WhileLoop.WhileLoopMoreExercise.src;

import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isFound = false;
        while (counter < capacity) {
            String currentBook = scanner.nextLine();
            if (currentBook.equals(book)) {
                isFound = true;
                break;
            }
            counter++;
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
