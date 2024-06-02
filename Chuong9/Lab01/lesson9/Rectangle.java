/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9;

/**
 *
 * @author ADMIN
 */
public class Rectangle implements IShape {
    
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(){
        
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width)*2;
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public void show() {
        System.out.printf("Rectangle(%f, %f): perimeter = %.3f, area = %.3f\n",length,width,getPerimeter(),getArea());
    }
    
    
}
