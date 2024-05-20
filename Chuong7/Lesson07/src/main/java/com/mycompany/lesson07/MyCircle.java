/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson07;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint I;
    private double R;
    public MyCircle(){
        
    }

    public MyCircle(MyPoint I, double R) {
        this.I = I;
        this.R = R;
    }
    

    public MyCircle(double x,double y,double R)
    {
        this.I = new MyPoint(x, y);
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
    
    public double getCircumference(){
        return 2*R*Math.PI;
    }
    
    public double getArea(){
        return R*R*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle info: " + I.toString() + 
                ", radius = " + R + ", circumference = " 
                + String.format("%.3f", getCircumference()) 
                + ", area = " +
                String.format("%.3f", getArea());
    }
    
    
    
    
    
}
