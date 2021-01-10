package src.id.ac.its.GBox.spaceship;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceShipPlay extends JFrame {

    public SpaceShipPlay(String spaceshipTypeString) {

        initUI(spaceshipTypeString);
    }

    private void initUI(String spaceshipTypeString) {

        int spaceShipType = 0;

        if (spaceshipTypeString.equals("shooter")) {
            spaceShipType = 0;
        }
        else if (spaceshipTypeString.equals("fast")) {
            spaceShipType = 1;
        }

        add(new Board(spaceShipType));

        setResizable(false);
        pack();

        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpaceShipPlay ex = new SpaceShipPlay(args[0]);
            ex.setVisible(true);
        });
    }
}