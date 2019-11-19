package homework3;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        int countOfShip = 5;
        String[] namesList = {"Titanic", "Aurora", "Lisa", "Tina", "Elisabet"};

        Ship[] ships = new Ship[countOfShip];
        for (int i = 0; i < countOfShip; i++) {
            ships[i] = new Ship(random.nextInt(200), random.nextInt(5), namesList[i], random.nextInt(9000), getRandomShipTypes(), random.nextInt(20));
        }

        System.out.println("Массив кораблей");
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
        System.out.println("Массив кораблей отсортированный по имени");
        for (Ship ship : sortShipByName(ships)) {
            System.out.println(ship.toString());
        }
        System.out.println("Только военные корабли");
        for (Ship ship : getShipsByType(ships, ShipTypes.MILITARY)) {
            System.out.println(ship.toString());
        }
        System.out.println("Только торговые корабли");
        for (Ship ship : getShipsByType(ships, ShipTypes.CARGO)) {
            System.out.println(ship.toString());
        }

        String[] typeDeckLevel = {"lower", "average", "upper"};

        Boat[] boat = new Boat[5];
        for (int i = 0; i < boat.length - 2; i++) {
            boat[i] = new Boat(random.nextInt(200), random.nextInt(5), namesList[i], random.nextInt(9000),
                    getRandomShipTypes(), random.nextInt(100000), getRandom(typeDeckLevel), random.nextInt(50));
        }
        boat[3] = new Boat(getRandom(typeDeckLevel), random.nextInt(50));
        boat[4] = new Boat();
        System.out.println("Лодка");
        for (Boat deck : boat) {
            System.out.println(deck.toString());
        }
        System.out.println("numberOfObjects =" + Boat.numberOfObjects);

        System.out.println(boat[0].fastRun());
        System.out.println(boat[0].move());
        System.out.println(boat[1].utilization());


    }

    private static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static ShipTypes getRandomShipTypes() {
        int rnd = new Random().nextInt(ShipTypes.values().length);
        return ShipTypes.values()[rnd];
    }


    private static Ship[] sortShipByName(Ship[] ships) {

        new Ship();
        Ship tmpShip;
        for (int i = 0; i < ships.length; i++) {
            for (int j = (ships.length - 1); j >= (i + 1); j--) {
                if (ships[j].getName().compareTo(ships[j - 1].getName()) < 0) {
                    tmpShip = ships[j];
                    ships[j] = ships[j - 1];
                    ships[j - 1] = tmpShip;
                }
            }
        }

        return ships;
    }

    private static Ship[] getShipsByType(Ship[] ships, ShipTypes type) {
        int j = 0;
        for (Ship ship : ships) {
            if (ship.getType().equals(type)) {
                j++;
            }
        }
        Ship[] shipsRes = new Ship[j];
        for (Ship ship : ships) {
            if (ship.getType().equals(type)) {
                j--;
                shipsRes[j] = ship;
            }
        }
        return shipsRes;
    }
}
