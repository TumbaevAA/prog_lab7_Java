package com.company;


public class Main {

    public static void main(String[] args) {

        Point pForTriangle = new Point(1,1), pForTriangle1 = new Point(5,9),
                pForTriangle2 = new Point(9,1);
        IsoscelesTriangle t = new IsoscelesTriangle(pForTriangle, pForTriangle1, pForTriangle2);
        System.out.println("isosceles triangle line length: " + t.lineLength() + "\n");


        Point center = new Point(0,0);
        ColorCircle colorCircle = new ColorCircle(center, 3, "white");
        colorCircle.output();

        System.out.println("\n" + colorCircle.toString());

    }
}