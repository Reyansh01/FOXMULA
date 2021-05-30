package com.foxmula.assignment01;

class Parallelogram extends Quadrilateral
{
    private final int height;
    Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int i)
    {
        super.points(x1, y1, x2, y2, x3, y3, x4, y4);
//        points(x1, y1, x2, y2, x3, y3, x4, y4);
        height=i;
    }
    int area()
    {
        int d1=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return d1*height;
    }
}