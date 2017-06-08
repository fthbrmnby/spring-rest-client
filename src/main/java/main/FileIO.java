package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {

    public static List<String> readFile(String path) {
        Path file = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(file);
            return lines;
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
