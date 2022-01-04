package com.company;

import java.util.Scanner;

public class Point {
    private float x, y;
    private int id;
    private static int count = 0;

    public Point(){
        count++;
        id = count;
    }

    public Point(float x, float y){
        count ++;
        id = count;
        this.x = x;
        this.y = y;
    }

    public boolean input(){
        float x, y;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextFloat()){
            this.x = scanner.nextFloat();
            if (scanner.hasNextFloat()){
                this.y = scanner.nextFloat();
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public void output(){
        System.out.printf("\nx = %f, y = %f, id = %d", this.x, this.y, this.id);
    }

    public float distance(Point end){
        if (end == null) return -1;

        float d1 = end.x - this.x, d2 = end.y - this.y;
        return (float) Math.sqrt(d1 * d1 + d2 * d2);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public static float distanceToOrigin(Point p){
        Point origin = new Point(0,0);
        return origin.distance(p);
    }

}