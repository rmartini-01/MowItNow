package app.entity;

public enum Orientation {
    N, E, W, S;


    public Orientation rotateLeft() {
        switch (this) {
            case N:
                return W;
            case E:
                return N;
            case W:
                return S;
            case S:
                return E;
        }
        throw new IllegalArgumentException("Invalid Orientation");
    }

    public Orientation rotateRight() {
        switch (this) {
            case N:
                return E;
            case E:
                return S;
            case W:
                return N;
            case S:
                return W;
        }
        throw new IllegalArgumentException("Invalid Orientation");
    }
}
