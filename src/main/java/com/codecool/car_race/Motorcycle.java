package com.codecool.car_race;

import java.util.Random;

public final class Motorcycle extends Vehicle {
    private static int count;
    private Random random = new Random();

    public Motorcycle(){
        count++;
        setNormalSpeed(100);
        setName("Motorcyle "+count);
    }

    public static int getMotorcycles(){
        return count;
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isRaining()){
            int slowDown = random.nextInt(45)+5;
            setActualSpeed(getNormalSpeed()-slowDown);
        } else {
            setActualSpeed(getNormalSpeed());
        }
    }
}
