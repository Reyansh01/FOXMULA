package com.foxmula.assignment01;
import java.util.Scanner;

public class Quadrilateral {
    protected int x1,y1,x2,y2,x3,y3,x4,y4;
    void points(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for Square: ");
        Square sq=new Square(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt());
        System.out.println("Area Of The Square is: " + sq.area());

        Rectangle rec=new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Area Of The Rectangle is: " + rec.area());

        Parallelogram p=new Parallelogram(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
        System.out.println("Area Of The Parallelogram is: " + p.area());

        Trapezoid t=new Trapezoid(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
        System.out.println("Area Of The Trapezoid is: " + t.area());
    }
}
