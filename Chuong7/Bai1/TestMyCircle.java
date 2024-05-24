/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lesson7.Bai1;

/**
 *
 * @author Admin
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint tam1 = new MyPoint(2, 3);
        MyCircle c1 = new MyCircle(tam1, 5);
        MyPoint p = new MyPoint(6, 6);
        MyCircle c2 = new MyCircle(p, 8);
        MyCircle c3 = new MyCircle();
        System.out.println("Chu vi cua duong tron c1: " + c1.getCircumference());
        System.out.println("Chu vi cua duong tron c2: " + c2.getCircumference());
        System.out.println("Dien tich cua duong tron c1: " + c1.getArea());
        System.out.println("Dien tich cua duong tron c2: " + c2.getArea());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
