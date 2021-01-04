package src.id.ac.its.GBox.spaceship;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public abstract class SpaceShip extends Sprite {

    protected int dx;
    protected int dy;
    private List<Missile> missiles;

    public SpaceShip(int x, int y) {
        super(x, y);

        initCraft();
    }

    private void initCraft() {

        missiles = new ArrayList<>();
        loadImage("resources/spaceship/spaceship.png");
        getImageDimensions();
    }

    public abstract void move();

    public List<Missile> getMissiles() {
        return missiles;
    }

    public abstract void keyPressed(KeyEvent e);

    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }

    public abstract void keyReleased(KeyEvent e);
}