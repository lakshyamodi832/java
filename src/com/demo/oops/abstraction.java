package com.demo.oops;

public class abstraction {
    public void main(String[] args){
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

