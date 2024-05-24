/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson07;

/**
 *
 * @author Admin
 */
public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyPoint p = new MyPoint(6, 6);
        MyCircle c2 = new MyCircle(p, 8);
        System.out.println("Chu vi c1: " + c1.getCircumference());
        System.out.println("Dien tich c1: " + c1.getArea());
        System.out.println("Chu vi c2: " + c2.getCircumference());
        System.out.println("Dien tich c2: " + c2.getArea());
        System.out.println("Duong tron c1: " + c1.toString());
        System.out.println("Duong tron c2: " + c2.toString());
    }

}
