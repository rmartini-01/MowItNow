package app.strategy;

import app.entity.Mower;

public class RightStrategy implements MovementStrategy {
    @Override
    public void move(Mower mower) {
        mower.setOrientation(mower.getOrientation().rotateRight());
    }
}
