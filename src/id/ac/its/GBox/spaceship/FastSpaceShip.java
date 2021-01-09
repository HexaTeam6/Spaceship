package src.id.ac.its.GBox.spaceship;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class FastSpaceShip extends SpaceShip {
    private Boolean canShoot;

    public FastSpaceShip(int x, int y) {
        super(x, y);

        canShoot = true;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            if (canShoot)
            {
                fire();
                canShoot = false;
            }
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -3;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 3;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -3;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 3;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_SPACE) {
            canShoot = true;
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}