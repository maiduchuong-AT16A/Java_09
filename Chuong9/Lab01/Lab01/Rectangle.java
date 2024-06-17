/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson09.lab01;

/**
 *
 * @author Admin
 */
public class Rectangle implements IShape{
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double getPerimeter() {
        return (2*(this.length+this.width));
    }

    @Override
    public double getArea() {
      return (this.length*this.width);
    }

    @Override
    public void show() {
        System.out.printf("Rectangle(%.6f,%.6f):permeter = %.3f,area = %.3f",this.length,this.width,this.getPerimeter(),this.getArea());
        System.out.println("");
    }
    
}
