/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newm;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
public class Lab02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       for(int i = 1; i <= T; i++)
        {  
            int M = sc.nextInt(), N = sc.nextInt(), P = sc.nextInt(); 
            int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
            SinhVienATTT[] svAttt = new SinhVienATTT[M];
            for(int j = 0; j < M; j++)
            {  
                sc.nextLine();
                svAttt[j] = new SinhVienATTT(sc.nextLine(), "ATTT" , sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            
            SinhVienCNTT[] svCntt = new SinhVienCNTT[N];
            for(int j = 0; j < N; j++)
            {  
                sc.nextLine();
                svCntt[j] = new SinhVienCNTT(sc.nextLine(), "CNTT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            
            SinhVienDTVT[] svDtvt = new SinhVienDTVT[P];
            for(int j = 0; j < P; j++)
            {
                sc.nextLine();
                svDtvt[j] = new SinhVienDTVT(sc.nextLine(), "DTVT", sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            }
            System.out.println("Case#" + i + ":");
            System.out.println(svAttt[x].hienThiThongTin());
            System.out.println(svCntt[y].hienThiThongTin());
            System.out.println(svDtvt[z].hienThiThongTin());
        }
    }  
    
}
