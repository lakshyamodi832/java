package com.demo.oops;

public class polyomrphism {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        polyomrphism calc = new polyomrphism();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2, 3, 4));
    }
}
