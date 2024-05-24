/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson07;

/**
 *
 * @author Admin
 */
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(15, 20);
        MyPoint p2 = new MyPoint();
        p2.setX(2);
        p2.setY(3);
        MyPoint p3 = new MyPoint();
        p3.setXY(5, 6);
        System.out.println("Khoang cach tu p1 den p: " + p1.getDisstance(10, 10));
        System.out.println("Khoang cach tu p2 den p: " + p2.getDisstance(10, 10));
        System.out.println("Khoang cach tu p3 den p: " + p3.getDisstance(10, 10));
        System.out.println("Toa do cua p1: " + p1.toString());
        System.out.println("Toa do cua p2: " + p2.toString());
        System.out.println("Toa do cua p3: " + p3.toString());
    }
}
