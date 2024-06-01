/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Admin
 */
public class Circle implements IShape {

    private double radius;

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
    public double getPerimeter() {
        return 2 * 3.1415 * radius;
    }

    @Override
    public double getArea() {
        return 3.1415 * radius * radius;
    }

    @Override
    public void show() {
        System.out.print("Circle(r = " + String.format("%.6f", radius) + "): perimeter = " + String.format("%.3f", getPerimeter()) + ", area = " + String.format("%.3f", getArea()));
    }

}
