package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Point constructor test");
        Point p = new Point(0,0), p1 = new Point(1234), p2 = new Point();
        p.output();
        System.out.println("\nEnter coordinates of the second point");
        p1.input();
        p1.output();
        System.out.println("\nEnter coordinates of the third point");
        p2.input();
        p2.output();

        System.out.println("\n\n\nLine constructor test");
        Line l = new Line(p, p1), l1 = new Line();
        l.output();
        System.out.println("\nEnter start and end points of the line");
        l1.input();
        l1.output();


        System.out.println("\n\n\nTriangle constructor test");
        Triangle t = new Triangle(p,p1,p2), t1 = new Triangle();
        t.output();
        System.out.println("\nEnter first, second and third points of the triangle");
        t1.input();
        t1.output();


    }
}