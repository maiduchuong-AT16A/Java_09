/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9_lab1;

/**
 *
 * @author Admin
 */
public class Circle implements IShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
    
    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public void show() {
//Circle(r = 73.810000): perimeter = 463.762, area = 17115.133
        System.out.printf("Circle(r = %f): perimeter = %.03f, area = %.03f\n", radius, getPerimeter(), getArea());
    }
    
}