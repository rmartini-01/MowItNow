package app.entity;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position move(Orientation orientation) {
        switch (orientation) {
            case N:
                return new Position(x, y + 1);
            case E:
                return new Position(x + 1, y);
            case W:
                return new Position(x - 1, y);
            case S:
                return new Position(x, y - 1);

        }
        throw new IllegalArgumentException("Invalid position");
    }

    public boolean isValidPosition(int maxX, int maxY) {
        return (x >= 0 && x <= maxX) && (y >= 0 && y <= maxY);
    }
}
