package com.company;


public class Main {

    public static void main(String[] args) {

        Point[] pointArray = new Point[3];

        for (int i = 0; i < pointArray.length; i++) {
            System.out.println("Enter coordinates of the " + i + " point\n");
            pointArray[i] = new Point();
            pointArray[i].input();
            pointArray[i].output();
        }
    }
}