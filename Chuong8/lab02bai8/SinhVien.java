/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02bai8;

/**
 *
 * @author Admin
 */
public abstract class SinhVien {
    public String hoten;
    public String nganhhoc;

    public SinhVien(String hoten, String nganhhoc) {
        this.hoten = hoten;
        this.nganhhoc = nganhhoc;
    }

    public SinhVien() {
        super();
    }
    
    public abstract double getDiem();

    public String getHoten() {
        return hoten;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }
    public String getHocLuc(){
        
        if(getDiem() < 4.0){
            return "Yeu";
        }
        else if(getDiem()>=4.0 && getDiem() < 6.0){
             return "Trung binh";
        }
        else if(getDiem()>=6.0 && getDiem()<7.0 ){
            return "Trung binh kha";
        }
        else if(getDiem()>=7.0 && getDiem()<8.0){
            return "Kha";
        }
        else if(getDiem()>=8.0 && getDiem() <9.0){
             return "Gioi";
        }
        else if(getDiem()>=9.0){
             return "Xuat sac";
        }
        return null;
       
        
    }
    public void hienthithongtin(){
        System.out.printf("SV:%20s-%s-%.2f-%s",this.getHoten(),this.getNganhhoc(),this.getDiem(),this.getHocLuc());
    }
    

    
    
}
