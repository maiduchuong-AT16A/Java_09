/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author van
 */
public class Lab01_Main {

    public static void main(String[] args) {
        //System.setIn(new FileInputStream("D:\\JavaCore\\input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt(); //số lượng HCN cần nhập
            int N = sc.nextInt(); //số lượng hình tròn cần nhập
            int P = sc.nextInt(); //số HCN cần hiển thị 
            int Q = sc.nextInt(); //số hình tròn cần hiển thị

            Rectangle[] hcn = new Rectangle[M];
            for (int i = 0; i < M; i++) {
                double lenght = sc.nextDouble();
                double width = sc.nextDouble();
                hcn[i] = new Rectangle(lenght, width);
            }

            Circle[] cir = new Circle[N];
            for (int j = 0; j < N; j++) {
                double radius = sc.nextDouble();
               cir[j] = new Circle(radius);
            }
            
            System.out.println("Case #"+t+":");
            for (int p=0; p<P; p++){
                int i = sc.nextInt();
                hcn[i].show();
            }
            for (int q=0; q<Q; q++){
                int j = sc.nextInt();
                cir[j].show();
            }
        }
    }
}
