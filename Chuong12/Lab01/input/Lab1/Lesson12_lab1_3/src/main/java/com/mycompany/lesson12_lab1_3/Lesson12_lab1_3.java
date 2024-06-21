/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson12_lab1_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson12_lab1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        Calendar date = Calendar.getInstance();
        for (int i = 0; i < testcase; i++) {
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            date.set(Calendar.MONTH, sc.nextInt() - 1);
            date.set(Calendar.YEAR, sc.nextInt());
            System.out.println("Case #" + (i + 1) + ":");
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DATE, date.get(Calendar.DATE) - 1);
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DATE, date.get(Calendar.DATE) + 2);
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DAY_OF_MONTH, 1);
            System.out.println(df.format(date.getTime()));
            date.roll(Calendar.DAY_OF_MONTH, false);
            System.out.println(df.format(date.getTime()));

        }
    }
}
