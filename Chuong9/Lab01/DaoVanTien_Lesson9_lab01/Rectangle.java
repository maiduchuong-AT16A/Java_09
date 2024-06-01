/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoVanTien_Lesson9_lab01;

/**
 *
 * @author DELL
 */
public class Rectangle implements IShape{
    double length, width;

    public Rectangle() {
    }
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void show() {
//Rectangle(29.670000, 93.510000): perimeter = 246.360, area = 2774.442
        System.out.printf("Rectangle (%f, %f): perimeter = %.03f, area = %.03f\n",
                          length, width, getPerimeter(), getArea());
    }
    
    
}
