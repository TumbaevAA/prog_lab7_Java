package com.company;


public class Main {

    public static void main(String[] args) {

        //Тест Point
       try{
           Point.distanceToOrigin(null);
       }
       catch (NullPointerException e){
           System.out.println("Catching NullPointerException when using distanceToOrigin");
       }
       Point p = new Point();
       try{
           p.distance(null);
       }
       catch (NullPointerException e){
           System.out.println("Catching NullPointerException when using distance");
       }
       try{
           p.input();
       }
       catch (IllegalArgumentException e){
           System.out.println("Catching IllegalArgumentException when using input");
       }
    }
}