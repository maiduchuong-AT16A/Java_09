/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject21;

/**
 *
 * @author PC2
 */
public class Rectangle implements ISape{
     double  length;
    double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public void show(){
        System.out.printf("Rectangle(%.6f, %.6f): perimeter = %.3f, area = %.3f\n", length, width, getPerimeter(), getArea());
    }
}
