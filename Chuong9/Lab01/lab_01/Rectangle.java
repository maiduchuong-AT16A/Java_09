/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author quanm
 */
public class Rectangle implements IShape{
    protected double length, width;
    public Rectangle(double length, double width){
        this.length = length; this.width = width;
    }
    
    @Override
    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }
    
    @Override
    public double getArea(){
        return this.length * this.width;
    }
    
    public void show(){
       System.out.printf("Rectangle(%f, %f): perimeter = %.3f, area = %.3f\n", this.length, this.width, getPerimeter(), getArea()); ;
    }
}
