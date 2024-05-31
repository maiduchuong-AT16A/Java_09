/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02bai8;


public class SinhVienCNTT extends SinhVien{
    public double web;
    public double anroid;
    public double nhung;

    public SinhVienCNTT(String hoten, String nganhhoc) {
        super(hoten, nganhhoc);
    }

    

    public SinhVienCNTT(double web, double anroid, double nhung, String hoten, String nganhhoc) {
        super(hoten, nganhhoc);
        this.web = web;
        this.anroid = anroid;
        this.nhung = nhung;
    }

    SinhVienCNTT() {
        
    }

   


    public double getWeb() {
        return web;
    }

    public double getAnroid() {
        return anroid;
    }

    public double getNhung() {
        return nhung;
    }

    @Override
    public String getHoten() {
        return hoten;
    }

    @Override
    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setWeb(double web) {
        this.web = web;
    }

    public void setAnroid(double anroid) {
        this.anroid = anroid;
    }

    public void setNhung(double nhung) {
        this.nhung = nhung;
    }

    @Override
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     *
     * @param nganhhoc
     */
    @Override
    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }
    @Override
    public double getDiem(){
        return((this.getWeb()+this.getAnroid()*2+this.getNhung()*2)/5);
    }
    @Override
    public void hienthithongtin(){
         System.out.printf("SV:%20s-%s-%.2f-%s",this.getHoten(),this.getNganhhoc(),this.getDiem(),this.getHocLuc());
         System.out.println("");
    }

    

   
    
}
