package src;

import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\Files-and-Streams");
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory()) {
                System.out.printf("%s: [%d]%n", f.getName(), f.length());
            }
        }
    }
}
