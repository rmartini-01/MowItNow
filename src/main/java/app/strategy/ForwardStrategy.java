package app.strategy;

import app.entity.Mower;
import app.entity.Position;

public class ForwardStrategy implements MovementStrategy {
    @Override
    public void move(Mower mower) {
        if (mower.getPosition() == null) {
            throw new IllegalArgumentException("Mower position cannot be null");
        }
        Position position = mower.getPosition();
        position.move(mower.getOrientation());

        if (position.isValidPosition(mower.getLawn().getMaxX(), mower.getLawn().getMaxY())) mower.setPosition(position);
        else System.out.println("error while setting position");
    }
}
