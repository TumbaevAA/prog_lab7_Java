package com.company;


public class Main {

    public static void main(String[] args) {

        Point[][] twoDimensionalArray = new Point[2][3];
        for (int i = 0; i < twoDimensionalArray.length; i++)
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.println("\nEnter coordinates of the " + j + " point in the " + i + " row\n");
                twoDimensionalArray[i][j] = new Point();
                twoDimensionalArray[i][j].input();
                twoDimensionalArray[i][j].output();
            }


        Point[] pointArray = new Point[3];
        for (int i = 0; i < pointArray.length; i++) {
            System.out.println("\nEnter coordinates of the " + i + " point\n");
            pointArray[i] = new Point();
            pointArray[i].input();
            pointArray[i].output();
        }
    }
}