package com.company;

import java.util.Scanner;

public class Point {
    private float x, y;
    private int id;
    private static int count = 0;

    /*Id нельзя назначать через параметр.
    Конструктор только демонстрирует работу конструктора
    с одни параметром*/
    public Point(int id){
        this.id = id;
    }

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
                throw new IllegalArgumentException();
            }
        }
        else{
            throw new IllegalArgumentException();
        }
    }
    public float distance(Point end){
        if (end == null) throw new NullPointerException();

        float d1 = end.x - this.x, d2 = end.y - this.y;
        return (float) Math.sqrt(d1 * d1 + d2 * d2);
    }
    public static float distanceToOrigin(Point p){
        if (p == null) throw new NullPointerException();

        Point origin = new Point(0,0);
        return origin.distance(p);
    }


    public void output(){
        System.out.printf("\nx = %f, y = %f, id = %d", this.x, this.y, this.id);
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}