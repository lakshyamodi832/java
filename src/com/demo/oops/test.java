package com.demo.oops;

import org.w3c.dom.ls.LSOutput;

public class test {
    static class Animal{
        String name;
        void eat(){
            System.out.println(name + " is eating.");
        }
    }

    static class Dog extends Animal{
        void bark(){
            System.out.println(name + "is barking.");
        }
    }
    public static void main(String[] args){
//        Car car = new Car("White");
//        car.setSpeed(69);

        Dog dog = new Dog();
        dog.name = "Tommy";
        dog.eat();
        dog.bark();

    }
}
