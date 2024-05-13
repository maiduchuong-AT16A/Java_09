/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matran;

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        MaTran maTran = new MaTran();
        maTran.input();
        maTran.xuatMaTran();
        
        maTran.xoayPhai90Do();
        System.out.println("Xoay phai 90 do");
        maTran.xuatMaTran();
        
        maTran.xoay180Do();
        System.out.println("Xoay 180 do");
        maTran.xuatMaTran();
        
        maTran.xoayTrai90Do();
        System.out.println("Xoay trai 90 do");
        maTran.xuatMaTran();
    }
}
