/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson7.Bai1;

/**
 *
 * @author Admin
 */
public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getDistance(double x1,double y1) {
        double distance = Math.sqrt((x1-this.x)*(x1-this.x) + (y1-this.y)*(y1-this.y));
        return distance;
                
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
    

}
