/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_7;

/**
 *
 * @author quanm
 */
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyCircle c2 = new MyCircle(6, 6, 8);
        System.out.println(c1.getCircumference());
        System.out.println(c2.getCircumference());
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c1);
        System.out.println(c2);
    }
}
