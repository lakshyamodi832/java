package com.demo.multithreading;

public class numberCounter extends Thread{
    @Override
    public void run() {
        int count = 0;

        for(int i = 0; i<=500; i++){
            if(i % 2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
