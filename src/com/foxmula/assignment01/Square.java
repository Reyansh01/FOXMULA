package com.foxmula.assignment01;

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