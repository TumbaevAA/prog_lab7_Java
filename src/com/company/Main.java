package com.company;


public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(0,0), p2 = new Point(1,0), p3 = new Point(1,1), p4 = new Point(0,1);
        Triangle t1 = new Triangle(p1, p2, p4, "new triangle");
        t1.output();

        Square s = new Square(p1, p2, p3, p4, "new square");
        System.out.println("\n\n");
        s.output();

        Point pForT = new Point(0,0), pForT1 = new Point(0.5f,0.86602540378f), pForT2 = new Point(1,0);
        EquilateralTriangle t = new EquilateralTriangle(pForT, pForT1, pForT2);
        System.out.println("\n\n");
        t.output();

        Point center = new Point(0,0);
        ColorCircle colorCircle = new ColorCircle(center, 3, "white");
        System.out.println("\n\n");
        colorCircle.output();

        System.out.println("\n" + colorCircle.toString());
    }
}