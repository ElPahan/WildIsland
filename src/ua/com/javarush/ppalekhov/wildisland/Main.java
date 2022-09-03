package ua.com.javarush.ppalekhov.wildisland;

import ua.com.javarush.ppalekhov.wildisland.location.Island;
import ua.com.javarush.ppalekhov.wildisland.location.Location;

public class Main {
    public static void main(String[] args) {
        Island island = new Island();

        Location[][] locations = island.getLocation();

        for (int y = 0; y < locations.length; y++) {
            for (int x = 0; x < locations[y].length; x++) {
                System.out.print(locations[y][x].isWall() + "_");
            }
            System.out.println();
        }
    }
}
