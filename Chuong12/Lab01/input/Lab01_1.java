/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab01_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab01_1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'ITC' yyyy");
        for (int t = 1; t <= T; t++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            Calendar Date = Calendar.getInstance();
            Date.set(year, month - 1, day, 0, 0, 0);
            System.out.println("Case #"+t+":");
            System.out.println(df.format(Date.getTime()));
        }
    }
}
