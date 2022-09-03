package ua.com.javarush.ppalekhov.wildisland.kindsofcreature;

import java.util.Map;

public abstract class Animal {
    private int weight;
    private int speed;
    private int currentSatiety;
    private int maxSatiety;
    private Map<Class, Integer> probabilityToEat;
    private boolean isMoved;
    private boolean isAlive;
    private boolean isAte;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentSatiety() {
        return currentSatiety;
    }

    public void setCurrentSatiety(int currentSatiety) {
        this.currentSatiety = currentSatiety;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(int maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public Map<Class, Integer> getProbabilityToEat() {
        return probabilityToEat;
    }

    public void setProbabilityToEat(Map<Class, Integer> probabilityToEat) {
        this.probabilityToEat = probabilityToEat;
    }

    public boolean isMoved() {
        return isMoved;
    }

    public void setMoved(boolean moved) {
        isMoved = moved;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAte() {
        return isAte;
    }

    public void setAte(boolean ate) {
        isAte = ate;
    }
}
