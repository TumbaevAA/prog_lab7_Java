package com.company;

public class EquilateralTriangle extends Triangle{

    public EquilateralTriangle(Point first, Point second, Point third){
        if (first == null || second == null || third == null) throw new NullPointerException();

        float d1 = first.distance(second), d2 = second.distance(third), d3 = third.distance(first);
        if (d1 == 0 || d2 == 0 || d3 == 0 ||                       //Если какие-то точки совпадают - не инициализируем
                d1 != d2 || d1 != d3 || d2 != d3) { //Если длины сторон не равно - не инициализируем
            throw new IllegalArgumentException();
        }
        else{
            this.firstPoint = first;
            this.secondPoint = second;
            this.thirdPoint = third;
        }
    }


    @Override
    public boolean input(){
        try {
            Point first = new Point(), second = new Point(), third = new Point();
            first.input();
            second.input();
            third.input();

            float d1 = first.distance(second), d2 = second.distance(third), d3 = third.distance(first);
            if (d1 == 0 || d2 == 0 || d3 == 0 ||                       //Если какие-то точки совпадают - не инициализируем
                    d1 != d2 || d1 != d3 || d2 != d3) { //Если длины сторон не равно - не инициализируем
                throw new IllegalArgumentException();
            }

            this.firstPoint = first;
            this.secondPoint = second;
            this.thirdPoint = third;
            return true;
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
            return false;
        }
    }

    @Override
    public void output(){
        System.out.print("Triangle\n----------------------------------------------\n");
        System.out.print("Points\n");

        System.out.print("first");
        this.firstPoint.output();

        System.out.print("\nsecond");
        this.secondPoint.output();

        System.out.print("\nthird");
        this.thirdPoint.output();


        System.out.print("\n\nLine length = " + this.lineLength());

        System.out.printf("\n\nPerimeter = %f", this.perimeter());
        System.out.printf("\nArea = %f", this.area());
        System.out.print("\n----------------------------------------------");
    }

    public float lineLength(){
        return firstPoint.distance(this.secondPoint);
    }

    @Override
    public float perimeter(){
        return lineLength()*3;
    }


    @Override
    public float area(){
        float semiPerimeter = this.perimeter() / 2;
        return (float) Math.sqrt(semiPerimeter * (semiPerimeter - this.lineLength(1)) *
                (semiPerimeter - this.lineLength(2)) * (semiPerimeter - this.lineLength(3)));
    }


}
