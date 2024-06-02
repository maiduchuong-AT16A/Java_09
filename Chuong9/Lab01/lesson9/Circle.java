/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Circle implements IShape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle (){
        
    }

    @Override
    public double getPerimeter() {
        return (this.radius *2*Pi);
    }

    @Override
    public double getArea() {
        return (Pi* Math.pow(this.radius,2));
    }

    @Override
    public void show() {
        System.out.printf("Circle(r = %f): perimeter = %.3f, area = %.3f\n",radius,getPerimeter(),getArea());
    }
    
    
            
}
