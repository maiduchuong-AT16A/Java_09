/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author quanm
 */
public class tamGiac {
    Scanner sc = new Scanner(System.in);
    public double a, b, c;
    
    public tamGiac()
    {
        
    }
    
    public tamGiac(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
   public void input()
   {
      this.a = sc.nextDouble();
      this.b = sc.nextDouble();
      this.c = sc.nextDouble();    
   }
    
    public void output()
    {
        if(a + b > c || a + c > b || b + c > a)
        {
            if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a)
            {
                System.out.println("Tam giac vuong");
            }
            else if(a == b && b == c )
            {
                System.out.println("Tam giac deu");
            }
            else if(a == b || a == c || b == c)
            {
                System.out.println("Tam giac can");
            }
            else
            {
                System.out.println("Tam giac thuong");
            }
        }
    }    
    
    public double chuVi()
    {
       return a + b + c;
    }
    
    public double dienTich() 
    {
       return Math.sqrt(chuVi() * (chuVi() - a) * (chuVi() - b) * (chuVi() - c));
    }
    
}
