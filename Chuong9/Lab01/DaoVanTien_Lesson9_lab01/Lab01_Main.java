/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DaoVanTien_Lesson9_lab01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab01_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("D:\\Learning Java\\FileBtapDocx\\b9.in"));
        Scanner sc = new Scanner(System.in);
        short t, T = sc.nextShort();
        for (t=0; t<T; t++)
        {
            short M, N, P, Q;
            // Nhap dong 1: cac so M, N, P, Q
            M = sc.nextShort();
            N = sc.nextShort();
            P = sc.nextShort();
            Q = sc.nextShort();
            
            Rectangle[] hcn = new Rectangle[M];
            Circle[] tron = new Circle[N];
            int[] viTriHcn = new int[P];
            int[] viTriTron= new int[Q];
            // nhap dong 2: Dai, Rong cua HCN
            for (int m=0; m<M; m++)
            {
                hcn[m] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            // nhap dong 3: Ban kinh hTron
            for (int n=0; n<N; n++)
            {
                tron[n] = new Circle(sc.nextDouble());
            }
            // nhap dong 4: nhung HCN can hien thi
            for (int p=0; p<P; p++)
            {
                viTriHcn[p] = sc.nextInt();
            }
            // nhap dong 5: nhung hTron can hien thi
            for (int q=0; q<Q; q++)
            {
                viTriTron[q] = sc.nextInt();
            }
            
            // In
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
