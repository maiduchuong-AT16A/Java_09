/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson9_lab1;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Lesson9_lab1 {

     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        short t, T = sc.nextShort();
        for (t=0; t<T; t++)
        {
            short M, N, P, Q;
            M = sc.nextShort();
            N = sc.nextShort();
            P = sc.nextShort();
            Q = sc.nextShort();
            
            Rectangle[] hcn = new Rectangle[M];
            Circle[] tron = new Circle[N];
            int[] viTriHcn = new int[P];
            int[] viTriTron= new int[Q];
            for (int m=0; m<M; m++)
            {
                hcn[m] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            for (int n=0; n<N; n++)
            {
                tron[n] = new Circle(sc.nextDouble());
            }
            for (int p=0; p<P; p++)
            {
                viTriHcn[p] = sc.nextInt();
            }
            for (int q=0; q<Q; q++)
            {
                viTriTron[q] = sc.nextInt();
            }
            
            System.out.printf("Case #%d:\n", t+1);
            for (int p=0; p<P; p++)
            {
                hcn[viTriHcn[p]].show();
            }
            for (int q=0; q<Q; q++)
            {
                tron[viTriTron[q]].show();
            }
        }   
    }
}
