/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;

/**
 *
 * @author ADMIN
 */
public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(5,2,3);
        MyPoint p = new MyPoint(6,6);
        MyCircle c2 = new MyCircle(8,p);
        System.out.println("Chu vi cua duong tron c1 la: " +c1.getCircumference());
        System.out.println("Chu vi cua duong tron c2 la: " +c2.getCircumference());
        System.out.println("Din tich cua duong tron c1 la:" +c1.getArea());
        System.out.println("Din tich cua duong tron c2 la:" +c2.getArea());
        System.out.println("Thong tin duong tron c1 la :" +c1.toString());
        System.out.println("Thong tin duong tron c2 la :" +c2.toString());
    }
}
