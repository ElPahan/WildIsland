package ua.com.javarush.ppalekhov.wildisland.location;

public class Island {
    private static final int WIDTH = 5;
    private static final int LENGTH = 10;

    private Location[][] location;

    public  Island() {
        location = new Location[WIDTH][LENGTH];
        for (int y = 0; y < location.length; y++) {
            for (int x = 0; x < location[y].length; x++) {
                location[y][x] = new Location();
                if (y == 0 || y == location.length - 1) {
                    location[y][x].setWall();
                } else if (x == 0 || x == location[y].length - 1) {
                    location[y][x].setWall();
                }
            }
        }
    }

    public Location[][] getLocation() {
        return location;
    }
}
