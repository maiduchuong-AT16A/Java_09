/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson7.Bai1;

/**
 *
 * @author Admin
 */
public class MyCircle {

    private MyPoint tam;
    private double banKinh;

    public MyCircle() {
        tam = new MyPoint();        
        banKinh = 0;
    }

    public MyCircle(MyPoint tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getCircumference() {
        double chuVi = 2 * 3.141592653589793 * banKinh;
        return String.format("%.3f", chuVi);
    }

    public String getArea() {
        double area =  3.141592653589793 * banKinh * banKinh;
        return String.format("%.3f", area);
    }

    @Override
    public String toString() {
        return "Circle info: (" + tam.getX() + ", " + tam.getY() + "), radius = " + banKinh + ", circumference = " + getCircumference() + ", area = " + getArea();
    }

}
