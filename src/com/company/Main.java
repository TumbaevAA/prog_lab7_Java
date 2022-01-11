package com.company;


public class Main {

    public static void main(String[] args) {

        //Тест Triangle
        Point pForTriangle = new Point(8,9);
        Triangle t = new Triangle();
        try{
            t = new Triangle(pForTriangle, null, null);
        }
        catch (NullPointerException e){
            System.out.println("Catching NullPointerException when using Triangle constructor");
        }
        try{
            t = new Triangle(pForTriangle, pForTriangle, pForTriangle);
        }
        catch (IllegalArgumentException e){
            System.out.println("Catch IllegalArgumentException when using Triangle constructor");
        }
        t.input();


        //Тест Line
        Point pForLine = new Point(0,0);
        Line l = new Line();
        try{
            l = new Line(pForLine, null);
        }
        catch (NullPointerException e){
            System.out.println("Catching NullPointerException when using Line constructor");
        }
        try{
            l.isPointOnLine(null);
        }
        catch (NullPointerException e){
            System.out.println("Catching NullPointerException when using isPointOnLine");
        }
        l.input();


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