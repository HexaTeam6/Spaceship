package src.id.ac.its.GBox.spaceship;

public class ShipFactory{
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;

    public SpaceShip getSpaceShip(int shipID){
        if(shipID == 0){
            return new ShooterSpaceShip(ICRAFT_X, ICRAFT_Y);
        }else{
            return new FastSpaceShip(ICRAFT_X, ICRAFT_Y);
        } 
    }
   
}