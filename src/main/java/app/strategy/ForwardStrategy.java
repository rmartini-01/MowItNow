package app.strategy;

import app.entity.Mower;

public class ForwardStrategy implements MovementStrategy {
    @Override
    public void move(Mower mower) {
        if (mower.getPosition() == null) {
            throw new IllegalArgumentException("Mower position cannot be null");
        }
        mower.getPosition().move(mower.getDirection());

        if (mower.getPosition().isValidPosition(mower.getLawn().getMaxX(), mower.getLawn().getMaxY()))
            mower.setPosition(mower.getPosition());
    }
}
