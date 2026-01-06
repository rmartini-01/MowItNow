package app.parser;

import app.entity.Direction;
import app.entity.Lawn;
import app.entity.Mower;
import app.entity.Position;
import app.strategy.ForwardStrategy;
import app.strategy.LeftStrategy;
import app.strategy.MovementStrategy;
import app.strategy.RightStrategy;


public class Parser {

    public Lawn parseLawn(String[] lawnLine) {
        if (lawnLine[0] == null || lawnLine[1] == null)
            return null;
        int maxX = Integer.parseInt(lawnLine[0]);
        int maxY = Integer.parseInt(lawnLine[1]);
        return new Lawn(maxX, maxY);
    }

    public Mower parseMower(String[] line, Lawn lawn) {
        if (line[0] == null || line[1] == null || line[2] == null)
            return null;
        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        Direction direction = Direction.valueOf(line[2]);

        Position position = new Position(x, y);
        return new Mower(position, direction, lawn);
    }

    private MovementStrategy parseCommand(char c) {
        switch (c) {
            case 'D':
                return new RightStrategy();
            case 'A':
                return new ForwardStrategy();
            case 'G':
                return new LeftStrategy();
        }
        return null;
    }

    public void parseInstructions(Mower mower, String instructions) {
        for (char c : instructions.toCharArray()) {
            MovementStrategy strategy = parseCommand(c);
            if (strategy != null) {
                mower.performMovement(strategy);
            }
        }
    }
}
