package ua.com.javarush.ppalekhov.wildisland.location;

import ua.com.javarush.ppalekhov.wildisland.kindsofcreature.Animal;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private boolean wall = false;
    private List<Animal> animals = new ArrayList<>();


    public  List<Animal> getAnimals() {
        return animals;
    }

    public void setWall() {
        this.wall = true;
    }

    public boolean isWall() {
        return this.wall;
    }

    @Override
    public String toString() {
        return "Location{" +
                "animals=" + animals + "}";
    }
}
