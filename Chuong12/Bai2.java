/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateFormat df= new SimpleDateFormat("EEE dd-MM-yyyy");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            Calendar date=Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH,sc.nextInt());
            date.set(Calendar.MONTH,sc.nextInt()-1);
            date.set(Calendar.YEAR,sc.nextInt());
            System.out.printf("Case #%d",i);
            System.out.println("");
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DAY_OF_WEEK,2);
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DAY_OF_WEEK,1);
            date.set(Calendar.DAY_OF_WEEK,7);
            System.out.println(df.format(date.getTime()));
        }
        
    }
}
