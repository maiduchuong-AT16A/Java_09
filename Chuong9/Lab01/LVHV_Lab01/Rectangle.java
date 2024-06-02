/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

/**
 *
 * @author van
 */
public class Rectangle implements IShape{
    double lenght;
    double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    
    @Override
    public double getPerimeter(){
        return (lenght+width)*2;
    }
    
    @Override
    public double getArea(){
        return lenght*width;
    }
    
    @Override
    public void show(){
        System.out.printf("Rectangle(%.6f, %.6f): perimeter = %.3f, area = %.3f\n",lenght,width, getPerimeter(),getArea());
    }
}
