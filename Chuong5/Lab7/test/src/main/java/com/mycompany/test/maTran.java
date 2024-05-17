/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
import java.lang.Math;
public class maTran {
    Scanner sc = new Scanner(System.in);
    int hang, cot;
    int[][] a;
    
    public maTran()
    {
        
    }
    
    public maTran(int hang, int cot)
    {
        this.hang = hang;
        this.cot = cot;
        this.a = new int[hang][cot];
    }
    
    void input()
    {
        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    void output()
    {
        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println("");
        }  
    }
    
    void xoayPhai()
    {
        int[] b = new int[hang * cot];
        int e = 0;
        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                b[e++] = a[i][j];
            }
        }
        e = 0;
        int[][] c = new int[cot][hang];
        for(int j = hang - 1; j >= 0; j--)
        {
            for(int i = 0; i < cot; i++)
            {
                c[i][j] = b[e++];
            }
        }
        a = c;
        int temp = hang;
        hang = cot;
        cot = temp;
    }
    
    void xoayTrai()
    {
        int[] b = new int[hang * cot];
        int e = 0;
        for(int i = 0; i < hang; i++)
        {
            for(int j = 0; j < cot; j++)
            {
                b[e++] = a[i][j];
            }
        }
        e = 0;
        int[][] c = new int[cot][hang];
        for(int j = 0; j < hang; j++)
        {
            for(int i = cot - 1; i >= 0; i--)
            {
                c[i][j] = b[e++];
            }
        }
        a = c;
        int temp = hang;
        hang = cot;
        cot = temp;
    }
    
    void xoay180()
    {
        xoayPhai();
        xoayPhai();
    }    
}
