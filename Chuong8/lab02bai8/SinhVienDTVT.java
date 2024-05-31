/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02bai8;

/**
 *
 * @author Admin
 */
public class SinhVienDTVT extends SinhVien {
    public double truyendanso;
    public double thietkemodul;
    public double vidieukhien;

    public SinhVienDTVT(String hoten, String nganhhoc) {
        super(hoten, nganhhoc);
    }

    

    public SinhVienDTVT(double truyendanso, double thietkemodul, double vidieukhien, String hoten, String nganhhoc) {
        super(hoten, nganhhoc);
        this.truyendanso = truyendanso;
        this.thietkemodul = thietkemodul;
        this.vidieukhien = vidieukhien;
    }

    SinhVienDTVT() {
        
    }

    public double getTruyendanso() {
        return truyendanso;
    }

    public double getThietkemodul() {
        return thietkemodul;
    }

    public double getVidieukhien() {
        return vidieukhien;
    }

    @Override
    public String getHoten() {
        return hoten;
    }

    @Override
    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setTruyendanso(double truyendanso) {
        this.truyendanso = truyendanso;
    }

    public void setThietkemodul(double thietkemodul) {
        this.thietkemodul = thietkemodul;
    }

    public void setVidieukhien(double vidieukhien) {
        this.vidieukhien = vidieukhien;
    }

    @Override
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }
    @Override
    public double getDiem(){
        return((this.thietkemodul+this.getTruyendanso()+this.getVidieukhien()*2)/4);
    }
    @Override
    public void hienthithongtin(){
        System.out.printf("SV:%20s-%s-%.2f-%s",this.getHoten(),this.getNganhhoc(),this.getDiem(),this.getHocLuc());
        System.out.println("");
    }
}
