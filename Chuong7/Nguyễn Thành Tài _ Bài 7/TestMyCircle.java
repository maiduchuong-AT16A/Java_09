/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson07;

/**
 *
 * @author ACER
 */
public class TestMyCircle {
    public static void main(String[] args) {
        
        MyCircle c1 = new MyCircle(5,2,3);
        MyCircle c2 = new MyCircle(8,6,6);
        
           System.out.println(c1.getCircumference());
           System.out.println( c2.getCircumference());
           System.out.println(c1.getArea());
           System.out.println(c2.getArea());
        
           System.out.println(c1.toString());
           System.out.println(c2.toString());
           
        
         
        
        
    }
}
