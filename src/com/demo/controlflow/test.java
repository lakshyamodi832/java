package com.demo.controlflow;

public class test {
    static void main(String[] args){
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isGoodWeather = isSunny && isWarm;
        System.out.println("Beach Day = " + isGoodWeather);//true
        boolean isSnowing = true;
        boolean isRaining = true;
        boolean isBadWeather = isSnowing || isRaining;
        System.out.println("Bad Weather = " + isBadWeather);//true
        isRaining = false;
        System.out.println("Beach Day = " + !isRaining);//true

        isWarm = false;;
        if(isSnowing && isWarm){
            System.out.println("Beach Day");
        } else {
            System.out.println("Bad Weather");
        }

        if(isRaining || isSnowing){
            System.out.println("Bad Weather");
        }

        int day = 2;
        String dayName;

        if(day == 1){
            System.out.println("Monday");
        } else if(day == 2){
            System.out.println("Tuesday");
        } else if(day == 3){
            System.out.println("Wednesday");
        }//Tuesday

        switch(day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";

                System.out.println(dayName);//Tuesday
        }

        dayName = (day == 2) ? "Tuesday":"Monday";
    }
}
