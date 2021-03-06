package com.codecool.car_race;

import java.util.LinkedList;
import java.util.List;

public class Race {
    public static final int NUMBER_OF_VEHICLES = 10;

    private boolean yellowFlag;
    private Weather weather = new Weather();


    private List<Vehicle> vehicles = new LinkedList<>();

    //private Car[] cars = new Car[NUMBER_OF_VEHICLES];
    //private Truck[] trucks = new Truck[NUMBER_OF_VEHICLES];
    //private Motorcycle[] motorcycles = new Motorcycle[NUMBER_OF_VEHICLES];

    //private int cars_length = 0;
    //private int trucks_length = 0;
    //private int motorcycles_length = 0;

    public void registerRacer(Vehicle vehicle){
        vehicles.add(vehicle);
    }



    public void simulateRace(){
        for(int count=0; count<50; count++) {
            for(Vehicle vehicle:vehicles){
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
            weather.advance();
            yellowFlag = getBrokenTruckStatus();
            /*
            for (int i = 0; i < NUMBER_OF_VEHICLES; i++) {
                cars[i].moveForAnHour();
                trucks[i].moveForAnHour();
                motorcycles[i].moveForAnHour();
            }*/
        }
    }

    public void printRaceResults(){
        String results = "";
        for(Vehicle vehicle:vehicles){
            results += "name: "+vehicle.getName()+System.lineSeparator();
            results += "distance: "+vehicle.getDistanceTraveled()+System.lineSeparator();
            results += "type: "+vehicle.getClass().getSimpleName()+System.lineSeparator();
            results += System.lineSeparator();
        }
        System.out.println(results);
    }

    public boolean isYellowFlagActive(){
        return yellowFlag;
    }
    private boolean getBrokenTruckStatus(){
        for(Vehicle vehicle:vehicles){
            if(vehicle instanceof Truck){
                if (((Truck)vehicle).isBroken()){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isRaining(){
        return weather.isRaining();
    }
}
