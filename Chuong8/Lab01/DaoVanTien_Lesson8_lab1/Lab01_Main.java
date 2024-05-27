/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DaoVanTien_Lesson8_lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab01_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();
        for (int t=0; t<T; t++)
        {
            short M,N,P,Q;
            M = sc.nextShort(); // so luong hcn
            N = sc.nextShort(); // so luong hvuong
            P = sc.nextShort(); // so vi tri hcn
            Q = sc.nextShort(); // so vi tri hvuong
            
            HinhChuNhat[] hcn = new HinhChuNhat[M];
            HinhVuong[] hV = new HinhVuong[N];
            
            for (int i=0; i<M; i++)
            {
                double dai = sc.nextDouble();
                double rong = sc.nextDouble();
                hcn[i] = new HinhChuNhat(dai, rong);
            }
            for (int i=0; i<N; i++)
            {
                hV[i] = new HinhVuong(sc.nextDouble());
            }
            
            short[] p = new short[P];
            for (short i=0; i<P; i++)
            {
                p[i] = sc.nextShort();
            }
            
            short[] q = new short[Q];
            for (short i=0; i<Q; i++)
            {
                q[i] = sc.nextShort();
            }
            
            System.out.printf("Case #%d:\n",(t+1));
            for (short i=0; i<P; i++)
            {
                System.out.println(hcn[p[i]].hienThiThongTin());
            }
            
            for (short i=0; i<Q; i++)
            {
                System.out.println(hV[q[i]].hienThiThongTin());            
            }
        }
                
    }
}
