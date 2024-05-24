/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;

/**
 *
 * @author ADMIN
 */
public class MyCircle {

    private double r;
    private MyPoint tam = new MyPoint();

    public MyCircle(double r, MyPoint tam) {
        this.r = r;
        this.tam = tam;
    }

    public MyCircle() {
        r = 0;
        tam.SetXY(0, 0);
    }

    public MyCircle(double r, double x, double y) {
        this.r = r;
        this.tam = new MyPoint(x, y);
    }

    public double getR() {
        return r;
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public double getCircumference() {
        return 2 * r * Math.PI;
    }

    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle info: (%.02f, %.02f), radius = %.02f, circumference = %.03f, area = %.03f",
                tam.getX(), tam.getY(),r,getCircumference(),getArea());
    }
    
    
}
