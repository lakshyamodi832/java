package com.demo.datatypes;

public class Test {
     static void main(String[] args) {
        String a = "Hello!";
        //sout = System.out.println();
        System.out.println(a.length());
        System.out.println(a.charAt(5));
        System.out.println(a.substring(0,3));
        System.out.println(a.contains("Hell"));
        System.out.println(a.startsWith("H"));
        System.out.println(a.endsWith("!"));
        String b = a.replace("!", " World");
        System.out.println(b);
        int z = 10;
        System.out.println(Integer.toBinaryString(z));//=1010
        int x = 5, y = 3;
        System.out.println(Integer.toBinaryString(x&y));//1
        System.out.println(Integer.toBinaryString(x|y));//111
        System.out.println(Integer.toBinaryString(x^y));//110->XOR
     }
}
