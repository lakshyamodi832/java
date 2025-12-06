package com.demo.multithreading;

public class withoutmultiThreading {
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        int sum = 0;

        for(int i = 0; i<=5; i++){
            sum += i;
        }

        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - startTime);

        int count = 0;

        for(int i = 0; i<=500; i++){
            if(i % 2 == 0){
                count++;
            }
        }

        System.out.println(count);

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
