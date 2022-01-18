package com.company;

public abstract class GeometricFigure implements IOInterface {

    private String description;

    GeometricFigure(String description){
        this.description = description;
    }

    GeometricFigure(){}

    public String getDescription(){
        return description;
    }

    public abstract float area();
    public abstract float perimeter();
}
