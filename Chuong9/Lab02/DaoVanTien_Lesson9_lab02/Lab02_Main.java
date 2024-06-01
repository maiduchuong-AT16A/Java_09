/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DaoVanTien_Lesson9_lab02;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab02_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short t, T = sc.nextShort();
        for (t=0; t<T; t++)
        {
            int M, N;
            // nhap dong 1
            M = sc.nextInt(); // so luong FullTime
            N = sc.nextInt(); // so luong Partime
            FullTimeEmployee[] fte = new FullTimeEmployee[M];
            PartTimeEmployee[] pte = new PartTimeEmployee[N];
            int P, Q;
            // nhap dong 2
            P = sc.nextInt(); // so luong FTime can hien thi
            Q = sc.nextInt(); // so luong pTime can hien thi
            int[] nvF = new int[P];
            int[] nvP = new int[Q];
            for (int m=0; m<M; m++)
            {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                
                fte[m] = new FullTimeEmployee(name,paymentPerHour);
            }
            for (int n=0; n<N; n++)
            {
                sc.nextLine();
                String name = sc.nextLine();
                int paymentPerHour = sc.nextInt();
                int workingHour = sc.nextInt();
                pte[n] = new PartTimeEmployee(name, paymentPerHour, workingHour);
                
            }
            for (int p=0; p<P; p++)
                nvF[p] = sc.nextInt();
            for (int q=0; q<Q; q++)
                nvP[q] = sc.nextInt();
            
            // in ra
            System.out.printf("Case #%d:\n", t+1);
            for (int p=0; p<P; p++)
                fte[nvF[p]].showInfor();
            for (int q=0; q<Q; q++)
                pte[nvP[q]].showInfor();
        }
    }
    
}

