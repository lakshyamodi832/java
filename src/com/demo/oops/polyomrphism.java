package com.demo.oops;

public class polyomrphism {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

//    public static void main(String[] args){
//        polyomrphism calc = new polyomrphism();
//        System.out.println(calc.add(2,3));
//        System.out.println(calc.add(2, 3, 4));
//    }

    class Animal{
        void sound(){
            System.out.println("*animal noises");
        }
    }

    class Dog extends Animal{
        void sound(){
            System.out.println("Barks");
        }
    }

    class Cow extends Animal{
        void sound(){
            System.out.println("Moo");
        }
    }

    public void main(String[] args){
        Animal animal1 = new Dog();
        Animal animal2 = new Cow();

        animal1.sound();
        animal2.sound();
    }
}
