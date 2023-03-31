package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\User\\Desktop\\input.txt");
        List<String> lines = Files.readAllLines(path);
        Collections.sort(lines);
        PrintWriter out = new PrintWriter("C:\\Users\\User\\Desktop\\output.txt");
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
