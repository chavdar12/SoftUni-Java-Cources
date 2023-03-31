package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("C:\\Users\\User\\Desktop\\input.txt"); PrintStream out = new PrintStream("C:\\Users\\User\\Desktop\\output.txt")) {
            int c;
            while ((c = in.read()) != -1) {
                if (c == 44 || c == 46 || c == 33 || c == 63) {
                    continue;
                }
                out.write(c);
            }
        }
    }
}
