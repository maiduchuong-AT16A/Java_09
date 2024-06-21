/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab01_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab01_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        for (int t = 1; t <= T; t++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            Calendar Date = Calendar.getInstance();
            Date.set(year, month - 1, day);
            System.out.println("Case #" + t + ":");
            System.out.println(df.format(Date.getTime()));
            Calendar before = (Calendar) Date.clone();
            before.add(Calendar.DAY_OF_MONTH, -1);
            System.out.println(df.format(before.getTime()));
            before.add(Calendar.DAY_OF_MONTH, 2);
            System.out.println(df.format(before.getTime()));
            Calendar first = (Calendar) Date.clone();
            first.set(year, month - 1, day - day + 1);
            System.out.println(df.format(first.getTime()));
            first.add(Calendar.MONTH, 1);
            Calendar end = (Calendar) first.clone();
            end.add(Calendar.DAY_OF_MONTH, -1);
            System.out.println(df.format(end.getTime()));

        }
    }
}
