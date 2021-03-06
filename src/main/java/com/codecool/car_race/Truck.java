package com.codecool.car_race;

import java.util.Random;

public class Truck extends Vehicle {
    private static int count;
    private Random random = new Random();
    private State state;

    public Truck(){
        count++;
        setName(random.nextInt(1000)+"");
        setNormalSpeed(100);
    }

    public static int getTrucks(){
        return count;
    }

    public void moveForAnHour(){

    }
    public boolean isBroken() {
        if(state == State.NORMAL){
            return false;
        } else {
            return true;
        }
    }

    private State nextState(){
        switch(state){
            case NORMAL:
                int chanceForBrake = random.nextInt(100);
                if(chanceForBrake<5){
                    return State.BROKEN;
                } else {
                    return State.NORMAL;
                }
            case BROKEN:
                return State.BEING_REPAIRED;
            case BEING_REPAIRED:
                return State.NORMAL;
        }
        return State.NORMAL;
    }

    @Override
    public void prepareForLap(Race race) {
        if(isBroken()){
            setActualSpeed(0);
        } else {
            setActualSpeed(getNormalSpeed());
        }
        state = nextState();
    }
}

