package app.strategy;

import app.entity.Lawn;
import app.entity.Mower;
import app.entity.Position;
import org.junit.jupiter.api.Test;

import static app.entity.Orientation.N;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    public void moveForwardTest() {
        Position position = new Position(0, 0);
        Lawn lawn = new Lawn(3, 3);
        Mower mower = new Mower(position, N, lawn);

        MovementStrategy forwardStrategy = new ForwardStrategy();
        mower.performMovement(forwardStrategy);
        // assert new position is (0,1,N)
        assertEquals("(0,1,N)", mower.toString());
    }

    @Test
    public void moveLeftTest() {
        Position position = new Position(0, 0);
        Lawn lawn = new Lawn(3, 3);
        Mower mower = new Mower(position, N, lawn);
        MovementStrategy leftStrategy = new LeftStrategy();
        mower.performMovement(leftStrategy);
        // assert new position is (0,0,W)
        assertEquals("(0,0,N)", mower.toString());
    }

    @Test
    public void moveRightTest() {
        Position position = new Position(0, 0);
        Lawn lawn = new Lawn(3, 3);
        Mower mower = new Mower(position, N, lawn);
        MovementStrategy rightStrategy = new RightStrategy();
        mower.performMovement(rightStrategy);
        // assert new position is (0,0,S)
        assertEquals("(0,0,N)", mower.toString());
    }
}
