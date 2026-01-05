package app.entity;

public class Mower {
    // La classe Mower représente la tondeuse : Celle-ci possède une position et 'appartient' à une pelouse.

    private Position position;
    private final Lawn lawn;

    public Mower(Position position, Lawn lawn){
        this.position = position;
        this.lawn = lawn;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Lawn getLawn() {
        return lawn;
    }
}
