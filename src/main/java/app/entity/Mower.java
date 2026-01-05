package app.entity;

import app.strategy.MovementStrategy;

public class Mower {
    // La classe Mower représente la tondeuse : Celle-ci possède une position, une orientation et 'appartient' à une pelouse.

    private Position position;
    private final Lawn lawn;
    private Orientation orientation;

    public Mower(Position position, Orientation orientation, Lawn lawn) {
        this.position = position;
        this.lawn = lawn;
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public Lawn getLawn() {
        return lawn;
    }

    public void performMovement(MovementStrategy strategy) {
        strategy.move(this);
    }

    @Override
    public String toString() {
        return "(" + getPosition().getX() +
                "," + getPosition().getY() +
                "," + getOrientation() +
                ')';
    }
}
