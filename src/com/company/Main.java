package com.company;


import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        OkkoOne g = new OkkoOne();

        DriverAmator d = new DriverAmator();
        System.out.println(d.name_one +" "+ d.calculation_skill());

        Vehicle v0 = new Vehicle();
        v0.moveTo(g.gasRefill(1000000.0),d.calculation_skill());



    }
}







