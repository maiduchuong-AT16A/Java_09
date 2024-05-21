/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson07;

/**
 *
 * @author ACER
 */
public class MyPoint {

    private double x;
   private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

   public MyPoint() {
    this.x = 0;
    this.y = 0;
   }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getDistance(double x1,double y1){
        double b = Math.sqrt((x-x1)*(x-x1) + (y - y1)*(y-y1));
        return b;
    }
   public void setXY(double x,double y){
      this.x = x;
      this.y = y;
      
   }

    @Override
    public String toString() {
        return "("+ x + ", " + y + ')';
    }
   
}
