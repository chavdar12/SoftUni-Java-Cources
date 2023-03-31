package src;

import java.io.File;
import java.io.IOException;

public class NestedFolders {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\Files-and-Streams");
        int count = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    count++;
                    System.out.println(f.getName());
                }
            }
        }
        System.out.println("Count of all folders: " + count);
    }
}