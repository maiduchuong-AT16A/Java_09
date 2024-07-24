/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson12.lab1_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class lab1_3 {
    public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);

        int t;
        t = SC.nextInt();

        for (int i = 0; i < t; i++) {
            int day = SC.nextInt();
            int month = SC.nextInt();
            int year = SC.nextInt();

            Calendar date = Calendar.getInstance();
            date.set(year, month - 1, day);

            SimpleDateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");

            System.out.printf("Case #%d:\n", i + 1);
            System.out.println(df.format(date.getTime()));
            
            date.add(Calendar.DAY_OF_MONTH,-1);
            System.out.println(df.format(date.getTime()));
            
             date.add(Calendar.DAY_OF_MONTH,2);
            System.out.println(df.format(date.getTime()));
            
              date.set(year, month - 1, 1);
            System.out.println(df.format(date.getTime()));
            
            date.set(year, month, 0);
            System.out.println(df.format(date.getTime()));
            
            
        }
    }
}
