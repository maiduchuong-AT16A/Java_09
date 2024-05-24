/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson07;

/**
 *
 * @author Admin
 */
public class MyPoint {

    private double X;
    private double Y;

    public MyPoint() {
        
    }

    public MyPoint(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    public void setXY(double  x, double y){
        X = x;
        Y = y;
    }

    
    public double getDisstance(double x1, double y1) {
        return Math.sqrt(Math.pow((x1 - X), 2) + Math.pow((y1 - Y), 2));
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }

}
