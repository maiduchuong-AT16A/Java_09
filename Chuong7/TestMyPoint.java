
package com.mycompany.oop;

public class TestMyPoint 
{
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(15, 20);
        MyPoint p2 = new MyPoint();
        p2.setX(2);
        p2.setY(3);
        MyPoint p3 = new MyPoint();
        p3.setXY(5, 6);
        System.out.println(p1.getDistance(10, 10));
        System.out.println(p2.getDistance(10, 10));
        System.out.println(p3.getDistance(10, 10));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
