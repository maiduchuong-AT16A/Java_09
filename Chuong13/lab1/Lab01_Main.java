/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai2;

import static java.lang.constant.ConstantDescs.NULL;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author tuan anh
 */
public class Lab01_Main {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<Integer> list = new LinkedList<>();
    static void case_1()
    {
        char kitu = sc.next().charAt(0);
        int X;
        switch (kitu) {
            case 'F':
                X = sc.nextInt();
                list.addFirst(X);
                break;
            case 'L':
                X = sc.nextInt();
                list.addLast(X);
                break;
            default:
                int Y = sc.nextInt();
                X = sc.nextInt();
                if(Y<list.size()){
                    list.add(Y,X);
                }
                else
                {
                    list.add(X);
                }
        }
    }
    static void case_2()
    {
        int X = sc.nextInt();
        for(int i=0; i<list.size(); i++) 
        {
            if(list.get(i)==X)
                list.remove(i);
        }
        System.out.println(X);
    }
    static void case_3()
    {
        int dem =0;
        int X = sc.nextInt();
        for(int i=0; i<list.size();i++)
        {
            if(list.get(i)==X)
            {
                dem++;
            }
        }
        System.out.println(dem);
    }
    static void case_4()
    {
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i=X;i<=Y;i++)
        {
            System.out.printf("%d ", list.get(i));
        }
    }
    static void case_5()
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.printf("%d ", list.get(i));
        }
    }
    public static void main(String[] args) {
        int T = sc.nextInt();
        int d;
        for(int t=0; t<T; t++)
        {
            d = sc.nextInt();
            switch (d) {
                case 1:
                    case_1();
                    break;
                case 2:
                    case_2();
                    break;
                case 3:
                    case_3();
                    break;
                case 4:
                    case_4();
                    System.out.println("");
                    break;
                case 5:
                case_5();
                    System.out.println("");
                break;
            }
        }
    }
}
