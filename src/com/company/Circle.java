package com.company;

import java.util.Scanner;

public class Circle {
    private Point center;
    private float radius;

    public Circle(){
    }

    public Circle(Point center, float radius){
        this.center = center;
        this.radius = radius;
    }


    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        Point center = new Point();
        float radius;
        if (center.input() && scanner.hasNextFloat()){
            this.radius = scanner.nextFloat();
            this.center = center;
            return true;
        }

        return false;
    }

    public void output(){
        System.out.print("Circle\n----------------------------------------------\n");
        System.out.print("Center");
        this.center.output();

        System.out.printf("\n\nRadius = %f", this.getRadius());
        System.out.printf("\n\nCircumference = %f", this.circumference());
        System.out.printf("\nArea = %f", this.area());
        System.out.print("\n----------------------------------------------");
    }


    public float area(){
        return (float) (this.radius * this.radius * 3.1415926535);
    }

    public float circumference(){
        return (float) (this.radius * 2 * 3.1415926535);
    }

    public Point getCenter() {
        return center;
    }

    public float getRadius() {
        return radius;
    }
}