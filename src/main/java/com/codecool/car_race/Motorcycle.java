package com.codecool.car_race;

import java.util.Random;

public final class Motorcycle extends Vehicle {
    private static int count;
    private Random random = new Random();

    public Motorcycle(){
        count++;
        setName("Motorcyle "+count);
    }

    public static int getMotorcycles(){
        return count;
    }

    public void moveForAnHour(){
        System.out.println(getName()+" poruszyl sie");
    }

    @Override
    public void prepareForLap(Race race) {
        if(race.isRaining()){
            int slowDown = random.nextInt(45)+5;
            setActualSpeed(getNormalSpeed()-slowDown);
        }
    }
}
