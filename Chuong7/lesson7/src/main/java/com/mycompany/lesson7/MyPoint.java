/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lesson7;

/**
 *
 * @author ADMIN
 */
public class MyPoint {

    double x, y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void SetXY(double x, double y){
        this.x = x;
        this.y= y;
    }
   
    public double getDistance(double x1,double y1){
        return Math.sqrt(Math.pow((y1-y), 2) +Math.pow((x1-x), 2));
    }

    @Override
    public String toString() {
        return "(" +x + ", " +y +")";
    }
}
