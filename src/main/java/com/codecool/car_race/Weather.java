package com.codecool.car_race;

import java.util.Random;

public class Weather {
    private boolean isRaining = false;
    private Random random = new Random();
    public void advance(){
        int chanceOfRain = random.nextInt(100);
        if(chanceOfRain<30){
            isRaining = true;
        } else {
            isRaining = false;
        }
    }
    public boolean isRaining(){
        return isRaining;
    }
}
