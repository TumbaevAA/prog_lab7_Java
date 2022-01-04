package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Determining the distance to the origin\nEnter coordinates of the point");
        Point p = new Point();
        p.input();
        p.output();
        System.out.println("\nDistance to origin = " + Point.distanceToOrigin(p));


        System.out.println("Id generation with static field");
        Point p1 = new Point(1,1), p2 = new Point(2,2), p3 = new Point(3,3);
        p1.output();
        p2.output();
        p3.output();

    }
}