/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_01;

/**
 *
 * @author quanm
 */
public class Circle implements IShape{
    protected double radius;
    private static double PI = 3.141592653589793238462643383279;
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return 2 * PI * radius;
    }
    
    public double getArea(){
        return PI * radius * radius;
    }
    
    public void show(){
        System.out.printf("Circle(r = %f): perimeter = %.3f, area = %.3f\n", radius, getPerimeter(), getArea());
    }
}
