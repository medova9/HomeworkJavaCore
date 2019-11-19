package homework3;

import java.util.Objects;

public class Boat extends Ship {
    private String level;
    private int numberOfSailors;
    static int numberOfObjects;

    {
        numberOfObjects++;
    }

    Boat() {
    }

    Boat(double maxSpeed, int decks, String name, int weight, ShipTypes type, int termOfUse, String level, int numberOfSailors) {

        super(maxSpeed, decks, name, weight, type, termOfUse);
        this.level = level;
        this.numberOfSailors = numberOfSailors;
    }

    Boat(String level, int numberOfSailors) {
        this.level = level;
        this.numberOfSailors = numberOfSailors;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "MilitaryShip{" +
                "level='" + level + '\'' +
                ", numberOfSailors=" + numberOfSailors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boat that = (Boat) o;
        return numberOfSailors == that.numberOfSailors &&
                level.equals(that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), level, numberOfSailors);
    }
}
