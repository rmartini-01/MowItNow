package app.service;

import app.entity.Lawn;
import app.entity.Mower;
import app.parser.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    private final Parser parser;

    public FileService(Parser parser) {
        this.parser = parser;
    }

    public List<Mower> loadMowers(BufferedReader reader) throws IOException {
        String firstLine = reader.readLine();
        if (firstLine == null) {
            throw new IllegalArgumentException("File is empty");
        }

        Lawn lawn = parser.parseLawn(firstLine.split(" "));

        List<Mower> mowers = new ArrayList<>();
        String positionLine;

        while ((positionLine = reader.readLine()) != null) {
            String instructionLine = reader.readLine();
            if (instructionLine == null) {
                throw new IllegalArgumentException("Missing instruction line");
            }

            Mower mower = parser.parseMower(positionLine.split(" "), lawn);
            parser.parseInstructions(mower, instructionLine);
            mowers.add(mower);
        }

        return mowers;
    }
}
