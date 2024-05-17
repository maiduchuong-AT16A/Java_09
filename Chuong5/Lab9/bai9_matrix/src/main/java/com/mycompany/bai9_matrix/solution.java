/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai9_matrix;

/**
 *
 * @author ADMIN
 */
public class solution {
    public static void main(String[] args) {
    
        MaTran matran = new MaTran();
        matran.input();
        matran.output();
        
        matran.xoay_phai90();
        System.out.println("Ma tran xoay phai 90 do:");
        matran.output();
        
        matran.xoay_180();
        System.out.println("Ma tran xoay 180 do:");
        matran.output();
        
        matran.xoay_trai90();
        System.out.println("Ma tran xoay trai 90 do:");
        matran.output();
    }
}
