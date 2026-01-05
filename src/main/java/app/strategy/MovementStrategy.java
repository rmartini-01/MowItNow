package app.strategy;

import app.entity.Mower;

public interface MovementStrategy {
    // L'interface MovementStrategy définit la logique de déplacement de la tondeuse.

    void move(Mower mower);
}
