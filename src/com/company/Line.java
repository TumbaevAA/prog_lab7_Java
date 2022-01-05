package com.company;

public class Line {
    private Point startPoint, endPoint;

    Line(){}

    Line(Point start, Point end){
        this.startPoint = start;
        this.endPoint = end;
    }

    public boolean input(){
        Point start = new Point(), end = new Point();
        if (start.input() && end.input()){
            this.startPoint = start;
            this.endPoint = start;
        }
        return false;
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

    public boolean isPointOnLine(Point point){
        if (point == null) return false;
        return this.startPoint.distance(point) + this.endPoint.distance(point) == this.length();
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }
}