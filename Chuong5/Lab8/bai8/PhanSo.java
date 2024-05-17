/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhanSo {
    int tuso;
    int mauso;

    public PhanSo() {
        super();
    }

    public PhanSo(int tuso, int mauso) {
        super();
        this.tuso = tuso;
        this.mauso = mauso;
    }
    void nhapphanso(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao tu so:");
        tuso=sc.nextInt();
        System.out.println("nhap vao mau so:");
        mauso=sc.nextInt();
    }
    int ucln(int a, int b)
    {
        int r=-1;
        while (r!=0)
        {
            r=a%b;
            if (r==0)
                break;
            a=b;
            b=r;
        }
        return b;
    }
    
    void rutGon()
    {
        int n = ucln(tuso, mauso);
        tuso/=n;
        mauso/=n;
    }
    
    void showPhanSo()
    {
        System.out.println(tuso+"/"+mauso);
    }
    
    void nghichDaoPs()
    {
        int tmp=tuso;
        tuso=mauso;
        mauso=tmp;
    }

    private Scanner newScanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
