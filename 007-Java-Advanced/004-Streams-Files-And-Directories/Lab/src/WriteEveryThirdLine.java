package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("C:\\Users\\User\\Desktop\\input.txt");
             PrintStream out = new PrintStream("C:\\Users\\User\\Desktop\\output.txt")) {
            int c;
            int counter = 1;
            while ((c = in.read()) != -1) {
                if (c == 10) {
                    counter++;
                }
                if (counter % 3 == 0) {
                    out.write(c);
                }
            }
        }
    }
}
