/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            Calendar date=Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH,sc.nextInt());
            date.set(Calendar.MONTH,sc.nextInt()-1);
            date.set(Calendar.YEAR,sc.nextInt());
            date.set(Calendar.HOUR,0);
            date.set(Calendar.MINUTE,0);
            date.set(Calendar.SECOND,0);
            System.out.println("Case #"+i+":");
            System.out.println(date.getTime());
            
        }
    }
}
