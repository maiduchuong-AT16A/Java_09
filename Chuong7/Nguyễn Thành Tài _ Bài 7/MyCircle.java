/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson07;

/**
 *
 * @author ACER
 */
public class MyCircle {
     private double r;
      private MyPoint tam;
      
  public MyCircle() {
    this.tam = new MyPoint(0,0);
    this.r = 0;
}

    public MyCircle(double r, double x,double y) {
        this.r = r;
        this.tam = new MyPoint(x,y);
    }

    public MyCircle(double r, MyPoint tam) {
        this.r = r;
        this.tam = tam;
    }

    public double getR() {
        return r;
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }
  
    public double getCircumference(){
        return 2*Math.PI*r;
        
    }
    public double getArea(){
        return Math.PI*r*r;
    }

   @Override
public String toString() {
    return "Circle info: " + tam.toString() + ", radius = " + r + ", circumference = " + getCircumference() + ", area = " + getArea();
}
}
