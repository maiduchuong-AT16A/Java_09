/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson08.sinhvien;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab02_Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int T = SC.nextInt();
        for (int t = 0; t < T; t++) {
            int M = SC.nextInt();
            int N = SC.nextInt();
            int P = SC.nextInt();

            int x = SC.nextInt();
            int y = SC.nextInt();
            int z = SC.nextInt();
            
            SinhVienATTT A[] = new SinhVienATTT[M];
            SinhVienCNTT C[] = new SinhVienCNTT[N];
            SinhVienDTVT D[] = new SinhVienDTVT[P];
            SC.nextLine();
            
            for(int i = 0;i < M;i++){
              String ten = SC.nextLine();
              double diemMD = SC.nextDouble();
              double diemLTAT = SC.nextDouble();
              double diemDTS = SC.nextDouble();
              SC.nextLine();
              A[i] = new SinhVienATTT(diemMD,diemLTAT,diemDTS,ten,"ATTT");
            }
           
            
            
        
            for(int i = 0;i < N;i++){
               String ten = SC.nextLine();
              double diemWeb = SC.nextDouble();
              double diemAndroid = SC.nextDouble();
              double diemNhung = SC.nextDouble();
              SC.nextLine();
              C[i] = new SinhVienCNTT(diemWeb,diemAndroid,diemNhung,ten,"CNTT");
                
             
                
            }
            
            
       
            
            for(int i = 0;i < P;i++){
               String ten = SC.nextLine();
              double diemVDK = SC.nextDouble();
              double diemTDS = SC.nextDouble();
              double diemTKModule = SC.nextDouble();
              SC.nextLine();
              D[i] = new SinhVienDTVT(diemVDK,diemTDS,diemTKModule,ten,"DTVT");
                
                 
            }
            
            System.out.printf("\nCase #%d:\n",t + 1);
            System.out.println(A[x].toString());
            System.out.println(C[y].toString());
            System.out.println(D[z].toString());
           
          
             
            

        }
    }
}
