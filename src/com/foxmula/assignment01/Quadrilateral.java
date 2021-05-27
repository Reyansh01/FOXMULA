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
        System.out.println("Area Of The Square is " + sq.area());

        Rectangle rec=new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Area Of The Rectangle is " + rec.area());

        Parallelogram p=new Parallelogram(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
        System.out.println("Area Of The Parallelogram is " + p.area());

        Trapezoid t=new Trapezoid(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
                sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextInt());
        System.out.println("Area Of The Trapezoid is " + t.area());
    }
}

class Trapezoid extends Quadrilateral
{
    private final int height;
    Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int i)
    {
        points(x1, y1, x2, y2, x3, y3, x4, y4);
        height=i;
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2=(int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
        return ((d1+d2)*height)/2;
    }
}


class Parallelogram extends Quadrilateral
{
    private final int height;
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int i)
    {
        points(x1, y1, x2, y2, x3, y3, x4, y4);
        height=i;
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d1*height;
    }
}

class Square extends Quadrilateral
{
    Square(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        points(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int area()
    {
        int d=(int)Math.sqrt((x1-x2)*(x1-x2)*2);
        return d*d;
    }
}

class Rectangle extends Quadrilateral
{
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        points(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        int d2=(int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
        return d1*d2;
    }
}
