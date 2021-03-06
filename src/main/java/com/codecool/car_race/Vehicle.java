package com.codecool.car_race;

public class Vehicle {
    private String name;
    private int normalSpeed;
    private int actualSpeed;
    private int distanceTraveled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }
    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }
    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }
    public void prepareForLap(Race race){

    }


}
