package com.company;


public class Main {

    public static void main(String[] args) {

        System.out.println("Point constructor test");
        Point p = new Point(3,4), p1 = new Point(1234), p2 = new Point();
        p.output();
        System.out.println("\nEnter coordinates of the second point");
        p1.input();
        p1.output();
        System.out.println("\nEnter coordinates of the third point");
        p2.input();
        p2.output();






    }
}