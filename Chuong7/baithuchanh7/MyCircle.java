/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithuchanh7;

/**
 *
 * @author Admin
 */
public class MyCircle {

    MyPoint O;
    private double r;
    private final double PI= 3.14;
    public MyCircle() {
        this.O = new MyPoint(0,0);
        this.r = 0;
    }

    public MyCircle(MyPoint O, double r) {
        this.O = O;
        this.r = r;
    }

    public MyPoint getO() {
        return O;
    }

    public double getR() {
        return r;
    }

    public double getPI() {
        return PI;
    }

    public void setO(MyPoint O) {
        this.O = O;
    }

    public void setR(double r) {
        this.r = r;
    }

    
    public double getCircumference(){
        return (2*r*PI);
    }
    public double getArea(){
        return (r*r*PI);
    }
    @Override
    public String toString(){
              return String.format("Circle info: (%.02f, %.02f), radius = %.02f, circumference = %.03f, area = %.03f",
                              O.getX(), O.getY(),r, getCircumference(), getArea());
    }
    
}
