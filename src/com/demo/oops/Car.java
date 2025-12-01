package com.demo.oops;

public class Car {
    private int speed;
    private String color;

    public Car(String color){
        this.color = color;
        System.out.println(color);
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(speed);
    }

}
