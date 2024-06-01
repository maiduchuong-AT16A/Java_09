
package com.mycompany.oop;

public class MyPoint 
{
    private double x;
    private double y;
    public MyPoint() 
    {
        this.x = 0;
        this.y = 0;
    } 
    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX() 
    {
        return x;
    }
    public double getY() 
    {
        return y;
    }
    public void setX(double x) 
    {
        this.x = x;
    }
    public void setY(double y) 
    {
        this.y = y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getDistance(double x1,double y1)
    {
        double dis = Math.sqrt(Math.pow(x1-x,2)+ Math.pow(y1-y,2));
        return dis;
    }
    @Override
    public String toString() {
        return "(" + x + ',' + y + ')';
    }
    
}
