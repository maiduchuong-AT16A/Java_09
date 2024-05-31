/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02bai8;


public class SinhVienATTT extends SinhVien {

    public double madoc;
    public double laptrinhantoan;
    public double dieutraso;

    /**
     *
     */
   

    public SinhVienATTT(double madoc, double laptrinhantoan, double dieutraso, String nganhhoc, String hoten) {
        super(nganhhoc, hoten);
        this.madoc = madoc;
        this.laptrinhantoan = laptrinhantoan;
        this.dieutraso = dieutraso;
    }

    public SinhVienATTT(String nganhhoc, String hoten) {
        super(nganhhoc, hoten);
    }

    SinhVienATTT() {
       super();
    }

    

    

    public double getMadoc() {
        return madoc;
    }

    public double getLaptrinhantoan() {
        return laptrinhantoan;
    }

    public double getDieutraso() {
        return dieutraso;
    }

    public void setMadoc(double madoc) {
        this.madoc = madoc;
    }

    public void setLaptrinhantoan(double laptrinhantoan) {
        this.laptrinhantoan = laptrinhantoan;
    }

    public void setDieutraso(double dieutraso) {
        this.dieutraso = dieutraso;
    }
    @Override
    public double getDiem(){
        
        return((this.getMadoc()*2+this.getLaptrinhantoan()*2+this.getDieutraso())/5);
        
    }

    
    @Override
    public void hienthithongtin(){
        System.out.printf("SV:%20s-%s-%.2f-%s",this.getHoten(),this.getNganhhoc(),this.getDiem(),this.getHocLuc());
        System.out.println("");
    }
}
