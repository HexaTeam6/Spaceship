package src.id.ac.its.GBox.spaceship;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShip extends Sprite {

    protected int dx;
    protected int dy;
    protected int moveSpeed;
    protected boolean canShoot;
    private List<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);
        canShoot = true;

        initCraft();
    }

    private void initCraft() {

        missiles = new ArrayList<>();
        loadImage("resources/spaceship/spaceship.png");
        getImageDimensions();
    }

    public void move() {

        x += dx;
        y += dy;

        if (x < 1) {
            x = 1;
        }

        if (y < 1) {
            y = 1;
        }
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }

    protected void enableShoot() { }

    protected void disableShoot() { }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            if (canShoot)
            {
                fire();
                disableShoot();
            }
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -moveSpeed;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = moveSpeed;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -moveSpeed;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = moveSpeed;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_SPACE) {
            enableShoot();
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