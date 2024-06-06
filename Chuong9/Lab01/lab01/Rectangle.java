/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson09.lab01;


public class Rectangle implements Ishape{
    double length;
    double width;

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
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void show() {
        System.out.printf("Rectangle(%f, %f): perimeter = %.3f, area = %.3f\n",length, width, getPerimeter(), getArea());
    }
    
}
