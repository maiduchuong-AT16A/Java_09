/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.DaoVanTien_Lesson7;

/**
 *
 * @author DELL
 */
public class TestMyCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint p = new MyPoint(6, 6);
        MyCircle c1 = new MyCircle(2, 3, 5);
        MyCircle c2 = new MyCircle(p, 8);
        System.out.println(c1.getCircumference()+", "+c1.getArea());
        System.out.println(c2.getCircumference()+", "+c2.getArea());
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
    
}
