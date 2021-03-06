package com.codecool.car_race;

public class Truck {
    private static int count;

    public Truck(){
        count++;
    }

    public static int getTrucks(){
        return count;
    }

    public void moveForAnHour(){

    }
}
