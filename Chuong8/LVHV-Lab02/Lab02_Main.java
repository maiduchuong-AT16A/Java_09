/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.Scanner;

/**
 *
 * @author van
 */
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=1;t<=T;t++){
            int M = sc.nextInt(); //số lượng SV ATTT
            int N = sc.nextInt(); //số lượng sv CNTT
            int P = sc.nextInt(); //số lượng sv DTVT
            
            int x = sc.nextInt(); //sinh viên x khoa ATTT
            int y = sc.nextInt(); //sinh viên y khoa CNTT
            int z = sc.nextInt(); //sinh viên z khoa DTVT
            sc.nextLine();
            
            SinhVienATTT []sv1 = new SinhVienATTT[M];
            for (int i=0;i<M;i++){
                String Hoten = sc.nextLine();
                double diemMaDoc = sc.nextDouble();
                double diemLTAT = sc.nextDouble();
                double diemDTS = sc.nextDouble();
                sv1[i] = new SinhVienATTT(diemMaDoc, diemLTAT, diemDTS, Hoten, "ATTT");
            }
            
            sinhVienCNTT []sv2 = new sinhVienCNTT[N];
            for (int j=0;j<N;j++){
                String Hoten = sc.nextLine();
                double diemWeb = sc.nextDouble();
                double diemAndroid = sc.nextDouble();
                double diemNhung = sc.nextDouble();
                sv2[j] = new sinhVienCNTT(diemWeb, diemAndroid, diemNhung, Hoten, "CNTT");
            }
            
            SinhVienDTVT []sv3 = new SinhVienDTVT[P];
            for (int k=0;k<P;k++){
                String Hoten = sc.nextLine();
                double diemTDS = sc.nextDouble();
                double diemTKModule = sc.nextDouble();
                double diemVDK = sc.nextDouble();
                sv3[k] = new SinhVienDTVT(diemTDS, diemTKModule, diemVDK, Hoten, "DTVT");
            }
            //output
            System.out.println("Case #"+t+':');
            sv1[x].hienThiThongTin();
            sv2[y].hienThiThongTin();
            sv3[z].hienThiThongTin();
        }
    }
}
