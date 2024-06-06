/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.lab01;


public class Circle implements Ishape{
    double radius;

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
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void show() {
        System.out.printf("Circle(r = %f): perimeter = %.3f, area = %.3f\n", radius, getPerimeter(),getArea());
    }
    
}
