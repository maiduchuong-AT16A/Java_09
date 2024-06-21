/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson12_lab1_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson12_lab1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            Calendar date = Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            date.set(Calendar.MONTH, sc.nextInt() - 1);
            date.set(Calendar.YEAR, sc.nextInt());
            System.out.println("Case #"+(i+1)+":");
            System.out.println(df.format(date.getTime()));
            
            date.set(Calendar.DAY_OF_WEEK, 2);
            System.out.println(df.format(date.getTime()));
            date.add(Calendar.DAY_OF_WEEK, 6);
            System.out.println(df.format(date.getTime()));
        }
    }
}
