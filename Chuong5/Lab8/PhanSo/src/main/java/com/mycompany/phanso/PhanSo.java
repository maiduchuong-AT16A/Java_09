/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phanso;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {

    int tuSo;
    int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public PhanSo(){
        
    }
    
    void input(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Nhap tu so");
        tuSo = SC.nextInt();
        System.out.println("Nhap mau so");
        mauSo = SC.nextInt();
    }
    
    void rutGon(){
        int a = tuSo;
        int b = mauSo;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        tuSo /= a;
        mauSo /= a;
    }
    
    void hienThiPhanSo(){
        System.out.println("Phan so: " + tuSo + "/" + mauSo);
        
    }
    
    void nghichDaoPhanSo(){
        int tmp = tuSo;
        tuSo = mauSo;
        mauSo = tmp;
    }
    void hienThiPhanSoNghichDao(){
        System.out.println("Phan so nghich dao: " + tuSo + "/" + mauSo);
        
    }
}
