/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn= new HinhChuNhat();
        hcn.nhapthongtin();
        System.out.printf("diem tich la:%.2f",hcn.tinhdientich());
        System.out.println("");
        System.out.printf("chu vi la:%.2f",hcn.tinhchuvi());
    
    }
}
