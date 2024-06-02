/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01;

/**
 *
 * @author ACER
 */
public class Retangle implements IShape{
   double length;
   double width;

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
       return 2*(length + width);
    }

    @Override
    public double getArea() {
       return length*width;
    }

    @Override
    public void show() {
        System.out.printf("Rectangle(%.6f, %.6f): perimeter = %.3f, area = %.3f",length,width,getPerimeter(),getArea());
     
    }

    
   
       
   
    
    
    
}
