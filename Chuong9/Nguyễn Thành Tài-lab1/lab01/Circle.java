/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01;

/**
 *
 * @author ACER
 */
public class Circle implements IShape{
    
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
      return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
      return Math.PI*radius*radius;
    }

    @Override
    public void show() {
        System.out.printf("Circle(r = %.6f): perimeter = %.3f, area = %.3f",radius,getPerimeter(),getArea());
    }

 
    
    
    
    
}
