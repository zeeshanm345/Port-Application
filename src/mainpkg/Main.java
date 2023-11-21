package mainpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choose;
        Port port = null;
        List<Ship> listOfShips = new ArrayList<>();

        do {
            System.out.println("1. Dock a ship to port \n"
                    + "2. List ship statistics by showing capacity, size, number of container and their types. \r\n"
                    + "4. Unlock a container from ship\r\n"
                    + "5. Load a container from ship\r\n"
                    + "6. Add fuel to ship\r\n"
                    + "7. Depart a ship to another port. \r\n");

            choose = scanner.next().charAt(0);

            switch (choose) {
                case '1':
                    System.out.println("Dock a ship to port");
                    System.out.println("Do you want to create a new Ship? (Y/N)");
                    String userInput = scanner.next();

                    if (userInput.equalsIgnoreCase("Y")) {
                        if (port == null) {
                            System.out.println("******************************* ADD PORT DETAILS *********************");
                            System.out.println();
                            System.out.println("Enter port ID:");
                            int portId = scanner.nextInt();
                            System.out.println("Enter port geo location:");
                            String geoLocation = scanner.next();
                            System.out.println("Enter port country:");
                            String country = scanner.next();

                            port = new Port(portId, geoLocation, country, listOfShips);
                        }
                        Ship newship = createShip();
                        port.dock(newship);
                    }
                    break;

                case '2':
                    System.out.println("List ship statistics by showing "
                            + "capacity, size, number of container and their types.");
                    for (Ship ship : listOfShips) {
                        ship.displayShipStatistics();
                    }
                    break;

                case '3':
                    System.out.println("Bill a ship");
                    break;

                case '4':
                    System.out.println("Unlock a container from ship");
                    break;

                case '5':
                    System.out.println("Load a container from ship");
                    break;

                case '6':
                    System.out.println("Add fuel to ship");
                    break;

                case '7':
                    System.out.println("Depart a ship to another port");
                    break;
            }
        } while (choose != 7);
    }

    public static Ship createShip() {
        System.out.println("*************************** ENTER SHIP DETAILS **************************");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ship id ");
        int shipId = scanner.nextInt();
        System.out.println("Enter ship fuel");
        double fuel = scanner.nextDouble();
        System.out.println("Enter ship weight");
        double weight = scanner.nextDouble();

        Ship ship = new Ship(shipId, fuel, weight);

        System.out.println("How many containers does the ship have?");
        int numContainers = scanner.nextInt();

        for (int i = 1; i <= numContainers; i++) {
            System.out.println("Enter details for Container " + i);
            System.out.println("Enter container type (1. Basic / 2. Heavy / 3. Liquid / 4. Refrigerated):");
            int containerType = scanner.nextInt();

            Cantainer container = createContainer(containerType, i);
            ship.addContainer(container);
        }

        return ship;
    }

    public static Cantainer createContainer(int containerType, int id) {
        Scanner scanner = new Scanner(System.in);

        switch (containerType) {
            case 1:
                // Basic Container
                System.out.println("Enter weight for Basic Container " + id);
                double basicWeight = scanner.nextDouble();
                if (basicWeight > 3000) {
                    System.out.println("Weight exceeds the limit for Basic Container. Setting to maximum capacity (3000 kg).");
                    basicWeight = 3000;
                }
                return new BasicCantainer(id, basicWeight, 2);

            case 2:
                // Heavy Container
                System.out.println("Enter weight for Heavy Container " + id);
                double heavyWeight = scanner.nextDouble();
                if (heavyWeight > 5000) {
                    System.out.println("Weight exceeds the limit for Heavy Container. Setting to maximum capacity (5000 kg).");
                    heavyWeight = 5000;
                }
                return new HeavyCantainer(id, heavyWeight, 2);

            case 3:
                // Liquid Container
                System.out.println("Enter weight for Liquid Container " + id);
                double liquidWeight = scanner.nextDouble();
                if (liquidWeight > 2500) {
                    System.out.println("Weight exceeds the limit for Liquid Container. Setting to maximum capacity (2500 kg).");
                    liquidWeight = 2500;
                }
                return new LiquidCantainer(id, liquidWeight, 3.05);

            case 4:
                // Refrigerated Container
                System.out.println("Enter weight for Refrigerated Container " + id);
                double refrigeratedWeight = scanner.nextDouble();
                if (refrigeratedWeight > 2500) {
                    System.out.println("Weight exceeds the limit for Refrigerated Container. Setting to maximum capacity (2500 kg).");
                    refrigeratedWeight = 2500;
                }
                return new RefrigeratedCantainer(id, refrigeratedWeight, 3.5, refrigeratedWeight);

            default:
                System.out.println("Invalid container type");
        }
        return null;
    }
}
