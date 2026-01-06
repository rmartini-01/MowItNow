package app.entity;

import app.strategy.MovementStrategy;

public class Mower {
    // La classe Mower représente la tondeuse : Celle-ci possède une position, une orientation et 'appartient' à une pelouse.

    private Position position;
    private final Lawn lawn;
    private Direction direction;

    public Mower(Position position, Direction direction, Lawn lawn) {
        this.position = position;
        this.lawn = lawn;
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
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
                "," + getDirection() +
                ')';
    }
}
