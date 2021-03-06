package com.codecool.car_race;

public class Car {
    private static int count;
    /*
    private void addCar(){
        count++;
    }*/
    public static int getCars(){
        return count;
    }
    public Car(){
        //addCar();
        count++;
    }

    public void moveForAnHour(){
        //System.out.println("+");
    }
}
