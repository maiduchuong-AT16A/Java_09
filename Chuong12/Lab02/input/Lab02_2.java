/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab02_2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab02_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int day1 = sc.nextInt();
            int month1 = sc.nextInt();
            int year1 = sc.nextInt();
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int s1 = sc.nextInt();
            LocalDateTime firstDay = LocalDateTime.of(year1, month1, day1, h1, m1, s1);
            int day2 = sc.nextInt();
            int month2 = sc.nextInt();
            int year2 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int s2 = sc.nextInt();
            LocalDateTime secondDay = LocalDateTime.of(year2, month2, day2, h2, m2, s2);
            Duration kc = Duration.between(firstDay, secondDay);
            long second = Math.abs(kc.getSeconds());
            long days = second / (24 * 3600);
            second = second % (24*3600);
            long hours = second / 3600;
            second = second % 3600;
            long minutes = second / 60;
            second = second % 60;
            System.out.println("Case #" + t + ":");
            System.out.printf("Difference between (%02d/%02d/%4d %02d:%02d:%02d) and (%02d/%02d/%4d %02d:%02d:%02d): \n%d Days, %d Hours, %d Minutes, %d Seconds\n", day1, month1, year1, h1, m1, s1, day2, month2, year2, h2, m2, s2, days, hours, minutes, second);
        }
    }
}
