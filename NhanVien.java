/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop552024;

import java.util.Scanner;

public class NhanVien {

    String hoTen;
    int namsinh;
    String diachi;
    double tienluong;
    int giolam;
    
    public NhanVien(){
        super();
    }
    
    public NhanVien(String hoTen, int namsinh, String diachi, double tienluong, int giolam){
        super();
        this.hoTen = hoTen;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.giolam = giolam;
    }
    
    

    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap thong tin nhan vien:");
        System.out.printf("\nnhap ho ten:");
        hoTen = sc.nextLine();
        System.out.printf("\nnhap nam sinh: ");
        namsinh = sc.nextInt();
        sc.nextLine();
        System.out.printf("\nnhap dia chi:");
        diachi = sc.nextLine();
        System.out.printf("\nnhap tien luong:");
        tienluong = sc.nextDouble();
        System.out.printf("\nnhap so gio lam viec:");
        giolam = sc.nextInt();
    }

    void printfInfo() {
        System.out.println(hoTen);
        System.out.printf("%d", namsinh);
        System.out.printf("\n");
        System.out.println(diachi);
        System.out.printf("%.2f", tienluong);
        System.out.printf("\n");
        System.out.printf("%d", giolam);
        System.out.printf("\n");
    }

    double tinhThuong() {
        double thuong = 0;
        if (giolam >= 200) {
            thuong = tienluong + (double) tienluong / 5;

        } else if (giolam >= 100 && giolam < 200) {
            thuong = tienluong + (double) tienluong / 10;
        } else if (giolam < 100) {
            thuong = 0;
        }
        return thuong;    
    }
    
    
    
}