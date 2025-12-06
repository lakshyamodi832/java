package com.demo.oops;

public class abstraction {
    static void main() {

        Dog dog1 = new Dog();
        dog1.Hello();
        dog1.Bye();
        dog1.sleep();
    }
}

abstract class Animal{
    abstract void Hello();
    abstract void Bye();

    void sleep(){
        System.out.println("zzz...");
    }
}

class Dog extends Animal{

    @Override
    void Hello() {
        System.out.println("hi");
    }

    @Override
    void Bye() {
        System.out.println("bye");
    }
}

interface Mobile{
    int numofbattries = 1;
    void makeCall();
}

interface GPS{
    void navigation();
}

class Phone implements Mobile, GPS{

    @Override
    public void makeCall() {
        System.out.println("Calling...");
    }

    @Override
    public void navigation(){
        System.out.println("navigating... ");
    }
}