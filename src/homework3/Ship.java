package homework3;

import java.util.Objects;

public class Ship extends Transport implements MoveInterface, UtilizationInterface {
    private int decks;
    private String name;
    private int weight;
    private ShipTypes type;
    private int termOfUse;


    Ship(double speed, int decks, String name, int weight, ShipTypes type, int boardHeight) {
        super(speed);
        this.decks = decks;
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.termOfUse = boardHeight;
    }

    Ship() {
    }

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    ShipTypes getType() {
        return type;
    }

    public void setType(ShipTypes type) {
        this.type = type;
    }

    private int getTermOfUse() {
        return termOfUse;
    }

    public void setTermOfUse(int boardHeight) {
        this.termOfUse = boardHeight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "decks=" + decks +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", type=" + type +
                ", termOfUse=" + termOfUse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ship ship = (Ship) o;
        return decks == ship.decks &&
                weight == ship.weight &&
                termOfUse == ship.termOfUse &&
                name.equals(ship.name) &&
                type == ship.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), decks, name, weight, type, termOfUse);
    }

    @Override
    public String fastRun() {
        return "Движение с максимальной скоростью (" + super.getMaxSpeed() + " узлов)";
    }


    @Override
    public String move() {
        return "Двигаемся со средней скоростью " + this.getSpeed() + " узлов";
    }

    @Override
    public double getSpeed() {
        return super.getMaxSpeed() / 2;
    }

    @Override
    public String utilization() {
        return "Будет отправлен на утилизацию через " + getTimeToUtilization() + " лет";
    }

    @Override
    public int getTimeToUtilization() {
        return this.getTermOfUse();
    }
}
