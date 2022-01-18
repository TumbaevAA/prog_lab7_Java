package com.company;

public class IsoscelesTriangle extends Triangle {
    IsoscelesTriangle(Point first, Point second, Point third){
        super(first, second, third);
    }
    public float lineLength(){
        return firstPoint.distance(this.secondPoint);
    }
}
