package app;


import app.entity.Mower;
import app.parser.Parser;
import app.service.FileService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/input.txt"))) {
            FileService service = new FileService(new Parser());
            List<Mower> mowers = service.loadMowers(reader);
            mowers.forEach(System.out::println);
        }
    }
}
