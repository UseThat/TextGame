package Model;

public class Unit {
    private double health;
    private double movementSpeed;

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public double getHealth() {
        return health;
    }
}
