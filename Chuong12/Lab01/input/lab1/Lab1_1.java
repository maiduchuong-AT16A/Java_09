/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson12.lab1_1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab1_1 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        int t;
        t = SC.nextInt();
        
        for(int i = 0;i < t;i++){
            Calendar date = Calendar.getInstance();
         
            int day = SC.nextInt();
            int month =  SC.nextInt();
            int year = SC.nextInt();
            
            date.set(year,month - 1,day,0,0,0);
            System.out.printf("Case #%d:\n",i + 1);
            System.out.println(date.getTime());
            
            
        }
    }
}
