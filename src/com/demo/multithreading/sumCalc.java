package com.demo.multithreading;

public class sumCalc implements Runnable{

    @Override
    public void run() {
        int sum = 0;

        for(int i = 0; i<=5; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
