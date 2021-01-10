package src.id.ac.its.GBox.spaceship;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class FastSpaceShip extends SpaceShip {
    public FastSpaceShip(int x, int y) {
        super(x, y);

        moveSpeed = 3;
    }

    protected void disableShoot() {
        canShoot = false;
    }

    protected void enableShoot() {
        canShoot = true;
    }
}