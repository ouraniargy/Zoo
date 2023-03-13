package com.unipi.talepis;

public class snake {
    double size;
    public static double weight;
    public static String color;
    String color1 = "white and blue";
    String color2 = "black and purple";
    String color3 = "yellow and white";
    double weight1 = 38.1;
    double weight2 = 32.1;
    double weight3 = 82.1;
    public static void sleep(){
        System.out.println("It is sleeping");
    }
    public static void play(){
        System.out.println("It is playing");
    }
    public static void eat(){
        System.out.println("It is eating");
    }
    public static void setWeight(double newWeight) {
        double weight  = newWeight;
    }
    public static void setColor(String newColor) {
        String color = newColor;
    }
}
