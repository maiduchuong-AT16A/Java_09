/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab01;

import java.util.Calendar;
import java.util.Scanner;

public class lab01_1 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int t, T = sc.nextInt();
        for (t=1; t<=T; t++)
        {
            int d, m, y;
            d = sc.nextInt();
            m = sc.nextInt();
            y = sc.nextInt();
            Calendar Date = Calendar.getInstance();
            Date.set(y, m-1, d);
            System.out.println("Case #"+t+":");
            System.out.println(Date.getTime());
        }
    }   
}
