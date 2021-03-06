package com.codecool.car_race;

public class Race {
    public static final int NUMBER_OF_VEHICLES = 10;

    private boolean yellowFlag;
    private Car[] cars = new Car[NUMBER_OF_VEHICLES];
    private Truck[] trucks = new Truck[NUMBER_OF_VEHICLES];
    private Motorcycle[] motorcycles = new Motorcycle[NUMBER_OF_VEHICLES];

    private int cars_length = 0;
    private int trucks_length = 0;
    private int motorcycles_length = 0;

    public void registerRacer(Car car){
        if(cars_length<NUMBER_OF_VEHICLES) {

            cars[cars_length++] = car;
            System.out.println("rejestruje samochod nr." + cars_length);
        } else {
            System.out.println("nie przewidziano więcej niż "+NUMBER_OF_VEHICLES+" samochod");
        }
    }

    public void registerRacer(Truck truck){
        trucks[trucks_length++] = truck;
        System.out.println("rejestruje ciezarowke nr."+trucks_length);
    }

    public void registerRacer(Motorcycle motorcycle){
        motorcycles[motorcycles_length++] = motorcycle;
        System.out.println("rejestruje motocykl nr."+motorcycles_length);
    }

    public void simulateRace(){
        for(int count=0; count<50; count++) {
            for (int i = 0; i < NUMBER_OF_VEHICLES; i++) {
                cars[i].moveForAnHour();
                trucks[i].moveForAnHour();
                motorcycles[i].moveForAnHour();
            }
        }
    }

    public void printRaceResults(){
        //TODO: implement ASAP
    }

    private boolean isYellowFlagActive(){
        return yellowFlag;
    }
}
