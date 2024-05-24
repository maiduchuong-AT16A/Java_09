/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_7;

/**
 *
 * @author quanm
 */
public class MyCircle {

    double PI = 3.141592653589793238462643383279;
    private MyPoint tam =  new MyPoint();
    private double banKinh;

    public MyCircle()
    {
        tam.setXY(0, 0);
        this.banKinh = 0;
    }
    public MyCircle(double x, double y, double banKinh) {
        tam.setX(x);
        tam.setY(y);
        this.banKinh = banKinh;
    }
    
    public MyCircle(double x, double y)
    {
        tam.setX(x); tam.setY(y);
    }

    public MyCircle(MyPoint tam, double banKinh) {
        this.tam.setXY(tam.getX(), tam.getY());
    }

    public void setTam(MyPoint tam) {
        this.tam.setXY(tam.getX(), tam.getY());
    }
    

    public MyPoint getTam() {
        return this.tam;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() 
    {
        return this.banKinh;
    }
    
    public double getCircumference() 
    {
        return 2 * PI * banKinh;
    }
    
    public double getArea()
    {
        return PI * banKinh * banKinh;
    }
    
    @Override
    public String toString()
    {
        return String.format("Circle info: (%.2f, %.2f), radius = %.2f, circumference = %.3f, area = %.3f", tam.getX(), tam.getY(), banKinh, getCircumference(), getArea());
    }
}
