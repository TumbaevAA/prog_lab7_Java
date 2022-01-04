package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Determining the distance to the origin\nEnter coordinates of the point");
        Point p = new Point();
        p.input();
        p.output();
        System.out.println("\nDistance to origin = " + Point.distanceToOrigin(p));




    }
}