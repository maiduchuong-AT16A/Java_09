/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;

/**
 *
 * @author van
 */
public class MyCircle {
    private MyPoint tam;
    private double r;

    public MyCircle() {
        this.tam = new MyPoint();
        this.r = 0;
    }

    public MyCircle(MyPoint tam, double r) {
        this.tam = tam;
        this.r = r;
    }

    public MyCircle(double x, double y,double r) {
        this.tam = new MyPoint(x, y);
        this.r = r;
    }

    double getCenterX() {
        return this.tam.getX();
    }

    double getCenterY() {
        return this.tam.getY();
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public static final double PI = 3.14159;
    public double getCircumference()
    {
        return r*PI*2;
    }
    
    public double getArea()
    {
        return PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle info: (" + tam.getX()+','+tam.getY()+"), radius = "+r+", circumference = "+getCircumference()+", area = "+getArea();
    }
    
    
}
