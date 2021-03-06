package com.codecool.car_race;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, wszystko na razie działa");
        Race race = new Race();

        //car.addCar();
        //race.registerRacer(new Car());
        //race.registerRacer(new Car());
        //race.registerRacer(car);
        for(int i=0; i<Race.NUMBER_OF_VEHICLES; i++){
            race.registerRacer(new Car());
            race.registerRacer(new Truck());
            race.registerRacer(new Motorcycle());
        }
        System.out.println(Car.getCars());
        System.out.println(Truck.getTrucks());
        System.out.println(Motorcycle.getMotorcycles());

        //race.registerRacer(new Car()); //will throw Index out of bounds exception
        race.simulateRace();

    }
}
