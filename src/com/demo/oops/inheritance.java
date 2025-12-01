package com.demo.oops;

public class inheritance {
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

        Dog dog = new Dog();
        dog.name = "Tommy";
        dog.eat();
        dog.bark();

    }
}
