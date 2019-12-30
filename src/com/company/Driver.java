package com.company;

public class Driver {
    String name;
    int age;
    double level;
    int driving_experience;

    public double calculation_skill(){
        double skill = (age+driving_experience + level)*0.01;
       if (skill>1){
           return 1;
       }
       else
           return skill;
    }



}

class DriverSport extends Driver{
    String name_one = "Shumaher";
    int age_one = 42;
    double level = 1.0 ;
    int driving_experience = 25;

    @Override
    public double calculation_skill(){
        double skill = (age+driving_experience + level)*0.05;
        if (skill>1){
            return 1;
        }
        else
            return skill;
    }
}

class DriverAmator extends Driver{
    String name_one = "Nick";
    int age_one = 22;
    double level = 0.45 ;
    int driving_experience = 2;

    @Override
    public double calculation_skill(){
        double skill = (age_one+level + driving_experience)*0.05;
        if (skill>1){
            return 1;
        }
        else
            return skill;
    }
}

class DriverProfessional extends Driver{
    String name_one = "Bill";
    int age_one = 52;
    double level = 0.93 ;
    int driving_experience = 20;

    @Override
    public double calculation_skill(){
        double skill = (age+driving_experience + level)*0.05;
        if (skill>1){
            return 1;
        }
        else
            return skill;
    }
}