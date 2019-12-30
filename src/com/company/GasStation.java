package com.company;

public class GasStation {
    double octane_number = 92;
    String name_station = "OKKO";
    int number_column =0 ;
    double price_fuel =1.0;
    double volume_fuel = 1000;

    public double gasRefill(double volume) {
        if (volume>volume_fuel){
            System.out.println("We don't have that much fuel");
            return 0;
        }
        else {
            System.out.println("we will refuel you on" + volume);
            System.out.println("refueling cost" + volume*price_fuel);
        }
        return octane_number/100;
    }
}

class OkkoOne extends GasStation {
    static double octane_number = 95;
    static int number_column = 1;
    static double price_fuel = 1.50;
    double volume_fuel = 5000;

    @Override
    public double gasRefill(double v) {
        if (v>volume_fuel){
            System.out.println("We don't have that much fuel");
            return 0;
        }
        else {
            System.out.println("we will refuel you on" + v);
            System.out.println("refueling cost" + v*price_fuel);
        }
        return octane_number/100;
    }
}

class OkkoTwo extends GasStation {
    static double octane_number = 92;
    static int number_column = 1;
    static double price_fuel = 1.20;
    double volume_fuel = 10000;

    @Override
    public double gasRefill(double v) {
        if (v>volume_fuel){
            System.out.println("We don't have that much fuel");
            return 0;
        }
        else {
            System.out.println("we will refuel you on" + v);
            System.out.println("refueling cost" + v*price_fuel);
        }
        return octane_number/100;
    }
}

class OkkoThree extends GasStation {
    static double octane_number = 98;
    static int number_column = 1;
    static double price_fuel = 2.10;
    double volume_fuel = 8000;

    @Override
    public double gasRefill(double v) {
        if (v>volume_fuel){
            System.out.println("We don't have that much fuel");
            return 0;
        }
        else {
            System.out.println("we will refuel you on" + v);
            System.out.println("refueling cost" + v*price_fuel);
        }
        return octane_number/100;
    }
}