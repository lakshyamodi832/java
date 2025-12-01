package com.demo.datatypes;

public class Test {
     static void main(String[] args) {
        String a = "Hello!";
        String str = new String("Hello");//string constructor
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
        System.out.println(Integer.toBinaryString(~x));//11111111111111111111111111111010->NOT
        System.out.println(Integer.toBinaryString(x << 1));//1010->LightShift
        System.out.println(Integer.toBinaryString(x >> 1));//10->RightShift
         boolean isSunny = true;
         boolean isWarm = true;
         boolean isGoodWeather = isSunny && isWarm;
         System.out.println("Beach Day = " + isGoodWeather);//true
         boolean isSnowing = true;
         boolean isRaining = true;
         boolean isBadWeather = isSnowing || isRaining;
         System.out.println("Bad Weather = " + isBadWeather);//true
         isRaining = false;
         System.out.println("Beach Day = " + !isRaining);//true

         isWarm = false;;
         if(isSnowing && isWarm){
             System.out.println("Beach Day");
         } else {
             System.out.println("Bad Weather");
         }

         if(isRaining || isSnowing){
             System.out.println("Bad Weather");
         }

         int day = 2;
         String dayName;

         if(day == 1){
             System.out.println("Monday");
         } else if(day == 2){
             System.out.println("Tuesday");
         } else if(day == 3){
             System.out.println("Wednesday");
         }//Tuesday

         switch(day){
             case 1:
                 dayName = "Monday";
                 break;
             case 2:
                 dayName = "Tuesday";
                 break;
             case 3:
                 dayName = "Wednesday";

             System.out.println(dayName);//Tuesday
         }

         dayName = (day == 2) ? "Tuesday":"Monday";
     }


}
