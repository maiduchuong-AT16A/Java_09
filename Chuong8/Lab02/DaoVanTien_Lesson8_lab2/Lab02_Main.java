/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DaoVanTien_Lesson8_lab2;

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
        short T = sc.nextShort();
        for (int t=0; t<T; t++)
        {
            // Nhap dong 1
            int M=sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            // Nhap dong 2
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sc.nextLine();
            
            SinhVienATTT[] svAT = new SinhVienATTT[M];
            SinhVienCNTT[] svCT = new SinhVienCNTT[N];
            SinhVienDTVT[] svDT = new SinhVienDTVT[P];
            
            for (int m=0; m<M; m++)
            {
                String hoTen = sc.nextLine();
                double diemMD = sc.nextDouble();
                double diemLTAT = sc.nextDouble();
                double diemDTS = sc.nextDouble();
                sc.nextLine();
                svAT[m] = new SinhVienATTT(hoTen, "ATTT", diemMD, diemLTAT, diemDTS);
            }
            
            for (int n=0; n<N; n++)
            {
                String hoTen = sc.nextLine();
                double diemWeb = sc.nextDouble();
                double diemAndroid = sc.nextDouble();
                double diemNhung = sc.nextDouble();
                sc.nextLine();
                svCT[n] = new SinhVienCNTT(hoTen, "CNTT", diemWeb, diemAndroid, diemNhung);
            }
            
            for (int p=0; p<P; p++)
            {
                String hoTen = sc.nextLine();
                double diemTDS = sc.nextDouble();
                double diemTKModule = sc.nextDouble();
                double diemVDK = sc.nextDouble();
                sc.nextLine();
                svDT[p] = new SinhVienDTVT(hoTen, "DTVT", diemTDS, diemTKModule, diemVDK);
            }
            
            System.out.printf("Case #%d:\n", t+1);
            System.out.println(svAT[x].hienThiThongTin());
            System.out.println(svCT[y].hienThiThongTin());
            System.out.println(svDT[z].hienThiThongTin());
        }
    }
    
}
