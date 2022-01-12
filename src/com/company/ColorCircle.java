package com.company;

import java.util.Scanner;

public class ColorCircle extends Circle{

    private String color;

    public ColorCircle(Point center, float radius, String color){
        super(center, radius);
        this.color = color;
    }

    @Override
    public boolean input() {
        try {
            Point center = new Point();
            center.input();
            Scanner scanner = new Scanner(System.in);
            float radius;
            if (scanner.hasNextFloat()) {
                radius = scanner.nextFloat();
                color = scanner.nextLine();
                this.center = center;
                this.radius = radius;
                return true;
            } else throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input");
            return false;
        }
    }

    @Override
    public void output(){
        System.out.print("Circle\n----------------------------------------------\n");
        System.out.print("Center");
        this.center.output();

        System.out.printf("\n\nRadius = %f", radius);
        System.out.printf("\n\nColor = %s", color);
        System.out.printf("\n\nCircumference = %f", this.circumference());
        System.out.printf("\nArea = %f", this.area());
        System.out.print("\n----------------------------------------------");
    }

    @Override
    public String toString() {
        return "ColorCircle{" +
                "center=" + center +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
