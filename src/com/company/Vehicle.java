package com.company;

public class Vehicle {
    String id = "id_vehicle";
    float maxSpeed = 100f;
    static int counter = 0;

    void moveTo(double n, double o) {
        System.out.println("Log: Vehicle -> moveTo(), id: " + id + ", Speed: " + maxSpeed * n * o + ", counter: " + counter);
    }

    static void refillGasTank() {
        System.out.println("Log: Vehicle -> static refillGasTank()");
    }
}

class Cars extends Vehicle {
    String id = "id_cars";
    float maxSpeed = 100;
    static int counter = 1;

    @Override
    void moveTo(double s, double o ) {
        System.out.println("Log: Cars -> moveTo(), id: " + id + ", Speed: " + maxSpeed * s * o + ", counter: " + counter);
    }

    static void refillGasTank() {
        System.out.println("Log: Cars -> static refillGasTank()");
    }
}

class SportCar extends Cars {
    String id = "id_sportCars";
    float maxSpeed = 20;
    static int counter = 2;

    @Override
    void moveTo(double n, double o) {
        System.out.println("Log: SportCar -> moveTo(), id: " + id + ", Speed: " + maxSpeed * n * o + ", counter: " + counter);
    }

    static void refillGasTank() {
        System.out.println("Log: SportCar -> static refillGasTank()");
    }
}