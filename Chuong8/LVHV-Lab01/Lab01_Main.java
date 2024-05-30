/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author van
 */
public class Lab01_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            System.out.println("Case #" + t + ':');
            int m = sc.nextInt(); //số lượng hình chữ nhật
            int n = sc.nextInt(); //số lượng hình vuông
            int p = sc.nextInt(); //số vị trí HCN
            int q = sc.nextInt(); //số vị trí hình vuông

            HinhChuNhat[] hcn = new HinhChuNhat[m];
            for (int i = 0; i < m; i++) {
                double a = sc.nextDouble(); //chiều dài HCN 
                double b = sc.nextDouble(); //chiều rộng HCN
                hcn[i] = new HinhChuNhat(a, b);
            }

            HinhVuong[] hv = new HinhVuong[n];
            for (int j = 0; j < n; j++) {
                double c = sc.nextDouble(); //cạnh hình vuông
                hv[j] = new HinhVuong(c);
            }

            for (int k = 0; k < p; k++) {
                int index = sc.nextInt();
                hcn[index].hienThiThongTin();
            }

            for (int l = 0; l < q; l++) {
                int index = sc.nextInt();
                hv[index].hienThiThongTin();
            }
        }
    }
}
