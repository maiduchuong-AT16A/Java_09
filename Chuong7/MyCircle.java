/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DaoVanTien_Lesson7;

/**
 *
 * @author DELL
 */
public class MyCircle {
    private MyPoint I = new MyPoint(0, 0);
    private double R=0;
    public MyCircle() {}
    
    public MyCircle(double x, double y, double R) {
        this.I.setXY(x,y);
        this.R = R;
    }

    public MyCircle(MyPoint I, double R) {
        this.I = I;
        this.R = R;
    }

    public MyPoint getI() {
        return I;
    }

    public void setI(MyPoint I) {
        this.I = I;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }
    
    public double getCircumference()
    {
        return 2*R*Math.PI;
    }
    
    public double getArea()
    {
        return R*R*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle info: (%.02f, %.02f), radius = %.02f, circumference = %.03f, area = %.03f",
                              I.getX(), I.getY(), R, getCircumference(), getArea());
    }
}
