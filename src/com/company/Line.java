package com.company;

public class Line {
    private Point startPoint, endPoint;

    Line(){}

    Line(Point start, Point end){
        if(start == null || end == null) throw new NullPointerException();
        this.startPoint = start;
        this.endPoint = end;
    }
    public boolean isPointOnLine(Point point){
        if (point == null) throw new NullPointerException();
        return this.startPoint.distance(point) + this.endPoint.distance(point) == this.length();
    }
    public boolean input(){
        try {
            Point start = new Point(), end = new Point();
            start.input();
            end.input();
            this.startPoint = start;
            this.endPoint = end;

            return true;
            }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
            return false;
        }
    }

    public void output(){
        System.out.print("Start of the line: ");
        this.startPoint.output();
        System.out.print("\nEnd of the line: ");
        this.endPoint.output();

        System.out.printf("\nLength of the line: %f", this.length());
    }

    public float length(){
        return this.startPoint.distance(this.endPoint);
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}