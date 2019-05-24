package Model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "HP: "+getHealth() + " movement: "+getMovementSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return Double.compare(unit.health, health) == 0 &&
                Double.compare(unit.movementSpeed, movementSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(health, movementSpeed);
    }
}
