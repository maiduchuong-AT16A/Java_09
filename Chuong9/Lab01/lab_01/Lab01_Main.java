/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab_01;

/**
 *
 * @author quanm
 */
import java.util.Scanner;
public class Lab01_Main {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
       for(int j = 1; j <= T; j++){
       int m = sc.nextInt(), n = sc.nextInt(), 
           p = sc.nextInt(), q = sc.nextInt();
       Rectangle[] hcn = new Rectangle[m];
       Circle[] htron = new Circle[n];
       for(int i = 0; i < m; i++){
           hcn[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());         
       }
       for(int i = 0; i < n; i++){
           htron[i] = new Circle(sc.nextDouble());
       }    
       System.out.println("Case: #" + j);
       for(int i = 0; i < p; i++){
           int P = sc.nextInt();  
           hcn[P].show();
       }
       for(int i = 0; i < q; i++){
           int Q = sc.nextInt();
           htron[Q].show();
       }
       }
    }
}
