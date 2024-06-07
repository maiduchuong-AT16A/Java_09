/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab_02;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
public class Lab02_Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int j = 1; j <= t; j++){
        
        int m = sc.nextInt(), n = sc.nextInt();   int p = sc.nextInt(), q = sc.nextInt();
        PartTimeEmployee[] nvpt = new PartTimeEmployee[n];
        FullTimeEmployee[] nvft = new FullTimeEmployee[m];
        
        for(int i = 0; i < m; i++){
            sc.nextLine();
            nvft[i] = new FullTimeEmployee(sc.nextLine(), sc.nextInt());
        }
        
        for(int i = 0; i < n; i++){
            sc.nextLine();
            nvpt[i] = new PartTimeEmployee(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        System.out.println("Case #" + j + ":");
        for(int i = 0; i < p; i++){
            int P = sc.nextInt();
            nvft[P].showInfo();
        }
        for(int i = 0; i < q; i++){
            int Q = sc.nextInt();
            nvpt[Q].showInfo();
        }
    }
    }
}
