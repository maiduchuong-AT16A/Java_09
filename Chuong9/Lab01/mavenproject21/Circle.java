/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject21;

/**
 *
 * @author PC2
 */
public class Circle implements ISape{
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    @Override
    public void show(){
        System.out.printf("Circle(r = %.6f): perimeter = %.3f, area = %.3f\n", radius, getPerimeter(), getArea());
    }
    
    
    
}
