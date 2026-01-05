package app.entity;

public class Lawn {
    // La class Lawn représente la pelouse: Une grille rectangulaire de taille maximale (x,y).
    private final int maxX;
    private final int maxY;


    public Lawn(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
