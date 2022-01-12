package com.company;


public class Main {

    public static void main(String[] args) {

        Point center = new Point(0,0);
        ColorCircle colorCircle = new ColorCircle(center, 3, "white");
        colorCircle.output();
    }
}