package com.company;

import java.util.Scanner;

public class Circle implements IOInterface {


    protected Point center;
    protected float radius;

    public Circle(){
    }

    public Circle(Point center, float radius){
        if(center == null) throw new NullPointerException();
        this.center = center;
        this.radius = radius;
    }
    public boolean input(){
        try {
            Point center = new Point();
            center.input();
            Scanner scanner = new Scanner(System.in);
            float radius;
            if (scanner.hasNextFloat()) {
                radius = scanner.nextFloat();
                this.center = center;
                this.radius = radius;
                return true;
            }
            else throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
            return false;
        }
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