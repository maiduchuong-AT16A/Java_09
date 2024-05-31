/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_8;

/**
 *
 * @author quanm
 */
public class HinhChuNhat{
   protected double chieuDai, chieuRong;
   
   public HinhChuNhat(){
   }
   
   public HinhChuNhat(double chieuDai, double chieuRong){
       this.chieuDai = chieuDai; this.chieuRong = chieuRong;
   }
   
   public void setChieuDai(double chieuDai){
       this.chieuDai = chieuDai;
   }
   
   public void setChieuRong(double chieuRong){
       this.chieuRong = chieuRong;
   }
   
   public double getChieuDai(){
       return this.chieuDai;
   }
   
   public double getchieuRong(){
       return this.chieuRong;
   }
   
   public double getChuVi(){
       return (this.chieuDai + this.chieuRong) * 2;
   }
   
   public double getDienTich(){
       return this.chieuDai * this.chieuRong;
   }
   
   public String hienThiThongTin(){
       return String.format("HCN(%f, %f): chu vi = %.3f, dien tich = %.3f", this.chieuDai, this.chieuRong, getChuVi(), getDienTich());
   }
}

