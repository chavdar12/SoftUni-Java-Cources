package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\";
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        File inputFile = new File(path + inputFileName);
        File outputFile = new File(path + outputFileName);
        try (FileInputStream in = new FileInputStream
                (inputFile); FileOutputStream out = new FileOutputStream(outputFile)) {
            int c;
            while ((c = in.read()) != -1) {
                if (c == 32 || c == 10) {
                    out.write(c);
                } else {
                    String ascii = String.valueOf(c);
                    for (int i = 0; i < ascii.length(); i++) {
                        out.write(ascii.charAt(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
