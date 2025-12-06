package com.demo.multithreading;

public class tNc {
    static void main() {
        try {
            int result = 10/0;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Error!");//cannot be divided by 0
        } finally {
            System.out.println("Finished!");
        }
    }
}
