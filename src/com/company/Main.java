package com.company;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point point1 = new Point(0,0), point2 = new Point(1,0), point3 = new Point(1,1);

        Triangle t2 = new Triangle(point1, point2, point3, "triangle for clone");
        System.out.println("\n\n");
        t2.output();

        Triangle cloneTriangle = (Triangle) t2.clone();
        System.out.println("\n\n");
        cloneTriangle.output();

        t2.setSecondPoint(10,10);

        System.out.println("\n\n");
        t2.output();

        System.out.println("\n\n");
        cloneTriangle.output();






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