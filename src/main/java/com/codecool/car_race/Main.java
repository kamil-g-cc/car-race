package com.codecool.car_race;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, wszystko na razie działa");
        Race race = new Race();

        for(int i=0; i<Race.NUMBER_OF_VEHICLES; i++){
            race.registerRacer(new Car());
            race.registerRacer(new Truck());
            race.registerRacer(new Motorcycle());
        }
        race.simulateRace();
        race.printRaceResults();
    }
}
