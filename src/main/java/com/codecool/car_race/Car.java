package com.codecool.car_race;

import java.util.Random;

public class Car extends Vehicle {
    private static int count;
    private Random random = new Random();
    private int speedDuringYellowFlag = 75;

    private final String[] names = {
        "Dragon",
            "Obsidian", "Vanish", "Guerilla", "Celestial", "Crux",
        "Onyx",
                "Bolt",
        "Dynamics",
                "Scout"
    };
    private String generateName(){
        String firstName = names[random.nextInt(10)];
        String secondName = names[random.nextInt(10)];
        return firstName+" "+secondName;
    }
    /*
    private void addCar(){
        count++;
    }*/
    public static int getCars(){
        return count;
    }
    public Car(){
        //80-110
        setNormalSpeed(random.nextInt(30) + 80);
        setName(generateName());
        count++;
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isYellowFlagActive()){
            setActualSpeed(speedDuringYellowFlag);
        } else {
            setActualSpeed(getNormalSpeed());
        }
    }
}
