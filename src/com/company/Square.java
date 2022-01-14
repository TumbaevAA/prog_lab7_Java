package com.company;

public class Square implements IOInterface{


    private Point firstPoint, secondPoint, thirdPoint, fourthPoint;

    public Square(){}

    public Square(Point first, Point second, Point third, Point fourth){
        if(first == null || second == null || third == null || fourth == null) throw new NullPointerException();

        float d1 = first.distance(second), d2 = second.distance(third), d3 = third.distance(fourth), d4 = fourth.distance(first);

        if (d1 == 0 || d2 == 0 || d3 == 0 || d4 == 0 ||                     //Если какие-то точки совпадают - не инициализируем
                first.distance(third) == 0 || second.distance(fourth) == 0 ||
                d1 != d3 || d1 != d4 || d2 != d3 || d2 != d4) {             //Если стороны не равны - не инициализируем
            throw new IllegalArgumentException();
        }
        else{
            this.firstPoint = first;
            this.secondPoint = second;
            this.thirdPoint = third;
            this.fourthPoint = fourth;
        }
    }

    public  boolean input(){
        try {
            Point first = new Point(), second = new Point(), third = new Point(), fourth = new Point();
            first.input();
            second.input();
            third.input();
            fourth.input();
            this.firstPoint = first;
            this.secondPoint = second;
            this.thirdPoint = third;
            this.fourthPoint = fourth;
            return true;
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
            return false;
        }
    }

    public void output(){
        System.out.print("Square\n----------------------------------------------\n");
        System.out.print("Points\n");

        System.out.print("first");
        this.firstPoint.output();

        System.out.print("\nsecond");
        this.secondPoint.output();

        System.out.print("\nthird");
        this.thirdPoint.output();

        System.out.print("\nfourth");
        this.fourthPoint.output();


        System.out.printf("\n\nLine length = %f", this.lineLength());


        System.out.printf("\n\nPerimeter = %f", this.perimeter());
        System.out.printf("\nArea = %f", this.area());
        System.out.print("\n----------------------------------------------");
    }

    public float lineLength(){
        return this.firstPoint.distance(secondPoint);
    }

    public float perimeter(){
        return this.lineLength() * 4;
    }

    public float area(){
        return this.lineLength() * this.lineLength();
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public Point getFourthPoint() {
        return fourthPoint;
    }
}
