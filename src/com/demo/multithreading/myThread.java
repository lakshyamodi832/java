package com.demo.multithreading;

public class myThread extends Thread{
    private counter Counter;

    public myThread(counter Counter){
        this.Counter = Counter;
    }
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            Counter.increment();
        }
    }

    static void main() {
        counter Counter = new counter();
        myThread t1 = new myThread(Counter);
        myThread t2 = new myThread(Counter);

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Counter.getCount());
    }
}

class counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}