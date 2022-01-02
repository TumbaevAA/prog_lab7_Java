package com.company;

public class Main {

    public static void main(String[] args) {

        //Работа с массивом
        Point[] arr = new Point[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Point(i,i+1);
            arr[i].output();
        }
    }
}
