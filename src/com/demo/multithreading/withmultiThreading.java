package com.demo.multithreading;

public class withmultiThreading {
    static void main() {

        long startTime = System.nanoTime();

        numberCounter thread1 = new numberCounter();

        sumCalc Sumcalc = new sumCalc();
        Thread thread2 = new Thread(Sumcalc);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.nanoTime() - startTime);
    }
}
