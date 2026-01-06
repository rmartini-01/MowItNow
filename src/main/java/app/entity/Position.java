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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case N:
                setY(y + 1);
                break;
            case E:
                setX(x + 1);
                break;
            case W:
                setX(x - 1);
                break;
            case S:
                setY(y - 1);
                break;
        }
    }

    public boolean isValidPosition(int maxX, int maxY) {
        return (x >= 0 && x <= maxX) && (y >= 0 && y <= maxY);
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }
}
