package com.demo.oops.encapsulation;

import com.demo.datatypes.Test;

public class Car {
    public int speed;
    private String color;

    public Car(String color){
        this.color = color;
        System.out.println(color);
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(speed);
    }

    public Car(){

    }
}
