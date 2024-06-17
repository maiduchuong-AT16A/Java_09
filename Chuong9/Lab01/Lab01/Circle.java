/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab01;

import static java.lang.Math.PI;

/**
 *
 * @author Admin
 */
public class Circle implements IShape{
    public double radius;
    

    public Circle(double radius) {
        
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    
    @Override
    public double getPerimeter() {
        return (2*Math.PI*this.radius);
    }

    @Override
    public double getArea() {
        return (Math.PI*this.radius*this.radius);
    }

    @Override
    public void show() {
        System.out.printf("Circle(r=%.6f): perimeter = %.3f,area = %.3f",this.radius,this.getPerimeter(),this.getArea());
        System.out.println("");
    }
    
}
