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

        System.out.println("\n\n\nSquare constructor test");
        Point pForSquare1 = new Point(0,0), pForSquare2 = new Point(1,0), pForSquare3 = new Point(1,1),
                pForSquare4 = new Point(0,1);
        Square s = new Square(pForSquare1, pForSquare2, pForSquare3, pForSquare4), s1 = new Square();
        s.output();
        System.out.println("\nEnter first, second, third and fourth points of the square");
        s1.input();
        s1.output();

    }
}