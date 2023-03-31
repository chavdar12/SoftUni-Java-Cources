package src;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Scanner;

public class ExtractIntegers {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\";
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        File inputFile = new File(path + inputFileName);
        File outputFile = new File(path + outputFileName);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        try (Scanner in = new Scanner(inputFile);
             PrintStream out = new PrintStream(outputFile)) {
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    numbers.offer(in.nextInt());
                }
                in.next();
            }
            while (!numbers.isEmpty()) {
                out.println(numbers.poll());
            }
        }
    }
}
