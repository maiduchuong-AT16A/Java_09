/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
    static Scanner sc = new Scanner(System.in);

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void inputInfo() {
        System.out.println("Nhap tu so: ");
        this.tuSo = sc.nextInt();
        System.out.println("Nhap mau so: ");
        this.mauSo = sc.nextInt();
    }
    private int UCLN(int a,int b) {
        if(b==0) return a;
        return UCLN(b, a%b);
    }
    
    
    public void rutGon() {
        int k = UCLN(tuSo, mauSo);
        this.tuSo = this.tuSo/k;
        this.mauSo = this.mauSo/k;
    }
    public void nghicDao() {
        int temp;
        temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
               
    }
    public void ouput() {
        System.out.printf("Phan so la: %d/%d", tuSo,mauSo);
    }

        
}
