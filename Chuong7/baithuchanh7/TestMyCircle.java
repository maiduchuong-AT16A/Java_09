/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baithuchanh7;

/**
 *
 * @author Admin
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,3);
        MyCircle c1 = new MyCircle(p1,5);
        MyPoint p2 = new MyPoint(6,6);
        MyCircle c2 = new MyCircle(p2,8);
        System.out.println(c1.getCircumference());
        
        System.out.println(c1.getArea());
        System.out.println(c2.getCircumference());
        System.out.println(c2.getArea());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
    }
}
