package com.company;


public class Main {

    public static void main(String[] args) {

        Point pForT = new Point(0,0), pForT1 = new Point(0.5f,0.86602540378f), pForT2 = new Point(1,0);
        EquilateralTriangle t = new EquilateralTriangle(pForT, pForT1, pForT2);
        t.output();

        Point center = new Point(0,0);
        ColorCircle colorCircle = new ColorCircle(center, 3, "white");
        System.out.println("\n\n");
        colorCircle.output();

        System.out.println("\n" + colorCircle.toString());

    }
}