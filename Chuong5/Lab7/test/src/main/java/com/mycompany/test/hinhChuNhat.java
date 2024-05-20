/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
import java.lang.Math;
public class hinhChuNhat {
    Scanner sc = new Scanner(System.in);
    int chieuDai, chieuRong;
     
    public hinhChuNhat()
    {
              
    }
    
    public hinhChuNhat(int dai, int rong)
    {
        chieuDai = dai;
        chieuRong = rong;
    }
    
    void input()
    {
        this.chieuDai = sc.nextInt();
        this.chieuRong = sc.nextInt();
    }
    
    void chuVi()
    {
        System.out.println("Chu vi hinh chu nhat la: " + (chieuDai + chieuRong));
    }
    
    void dienTich()
    {
        System.out.println("Dien tich hinh chu nhat la: " + (chieuDai * chieuRong));
    }
    
}


