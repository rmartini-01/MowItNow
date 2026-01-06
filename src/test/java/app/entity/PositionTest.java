package app.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void moveNorth() {
        Position position = new Position(2, 1);
        position.move(Direction.N);
        assertEquals("(2,2)", position.toString());
    }

    @Test
    void moveEast() {
        Position position = new Position(2, 1);
        position.move(Direction.E);
        assertEquals("(3,1)", position.toString());
    }

    @Test
    void moveWest() {
        Position position = new Position(2, 1);
        position.move(Direction.W);
        assertEquals("(1,1)", position.toString());
    }

    @Test
    void moveSouth() {
        Position position = new Position(2, 1);
        position.move(Direction.S);
        assertEquals("(2,0)", position.toString());
    }

    @Test
    void isValidPosition_true() {
        Position position = new Position(2, 1);
        // supposons que la pelouse est de taille 3, 3
        assertTrue(position.isValidPosition(3, 3));
    }

    @Test
    void isValidPosition_false() {
        Position position = new Position(2, 4);
        // supposons que la pelouse est de taille 3, 3
        assertFalse(position.isValidPosition(3, 3));
    }
}