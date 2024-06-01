
package com.mycompany.oop;

public class MyCircle extends MyPoint
{
    MyPoint I = new MyPoint();
    private double R;
    public final double Pi = 3.14159265359;
    public MyCircle() 
    {
        super();
        this.R = 0;
    }
    public MyCircle(double R, double x, double y) 
    {
        this.I.setXY(x, y);
        this.R = R;
    }
    public double getR() 
    {
        return R;
    }
    public MyPoint getI()
    {
        return I;
    }
    public void setCr(double R,double x,double y) 
    {
        I.setXY(x, y);
        this.R = R;
    }
    double getCircumference()
    {
        double cv;
        cv = Pi*R*2;
        return cv;
    }
    double getArea()
    {
        double s;
        s = Pi*R*R;
        return s;
    }
    @Override
    public String toString()
    {
        return String.format("Circle info: (%.2f, %.2f), radius = %.2f, circumference = %.3f, area = %.3f",I.getX(),I.getY(),R,getCircumference(),getArea());
    }
}
