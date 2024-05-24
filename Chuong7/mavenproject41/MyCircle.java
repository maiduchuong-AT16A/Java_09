/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject41;

/**
 *
 * @author dell-vip
 */
public class MyCircle {

    private MyPoint Tam;
    private double r;

    public MyCircle() {
        this.Tam = new MyPoint(0, 0);
        this.r = 0;
    }

    public MyCircle(double x, double y, double r) {
        this.Tam = new MyPoint(x, y);
        this.r = r;
    }

    public MyCircle(MyPoint Tam, double r) {
        this.Tam = Tam;
        this.r = r;
    }

    public MyPoint getTam() {
        return Tam;
    }

    public void setTam(MyPoint Tam) {
        this.Tam = Tam;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getCircumference() {
        return 2 * r * Math.PI;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle info: (" + Tam.getX() + ", " + Tam.getY() + "), radius = " + r + ", circumference = " + getCircumference() + ", area = " + getArea();
    }

}
