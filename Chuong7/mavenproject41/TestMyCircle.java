/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject41;

/**
 *
 * @author dell-vip
 */
public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyCircle c2 = new MyCircle();
        MyPoint p = new MyPoint(6, 6);
        c2.setTam(p);
        c2.setR(8);
        System.out.println("chu vi c1: " + c1.getCircumference());
        System.out.println("chu vi c2: " + c2.getCircumference());
        System.out.println("dien tich c1: " + c1.getArea());
        System.out.println("dien tich c2: " + c2.getArea());
        System.out.println("" + c1.toString());
        System.out.println("" + c2.toString());
    }
}
