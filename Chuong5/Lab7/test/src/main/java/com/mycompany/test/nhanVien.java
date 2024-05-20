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
public class nhanVien {
    String hoVaTen;
    int namSinh;
    String diaChi;
    double tienLuong;
    int tongGioLam;
    
    public nhanVien()
    {
        
    }
    
    public nhanVien(String hoVaTen, int namSinh, String diaChi, double tienLuong, int tongGioLam)
    {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        hoVaTen = sc.nextLine();
        namSinh = sc.nextInt();
        sc.nextLine();
        diaChi = sc.nextLine();
        tienLuong = sc.nextDouble();
        sc.nextLine();
        tongGioLam = sc.nextInt();
    }
    
    void output()
    {
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.printf("Tien luong: %.3f\n", tienLuong);
        System.out.println("Tong gio lam: " + tongGioLam);     
    }
    
    double tinhThuong()
    {
        if(tongGioLam >= 200)
        {
            return tienLuong * 1/5;
        }
        else if(tongGioLam < 200 && tongGioLam >= 100)
        {
            return tienLuong * 1/10;
        }
        else
        {
            return 0;
        }
    }
}
