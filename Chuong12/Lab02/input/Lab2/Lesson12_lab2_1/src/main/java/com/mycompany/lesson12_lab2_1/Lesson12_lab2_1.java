/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lesson12_lab2_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson12_lab2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int day1 = sc.nextInt();
            int month1 = sc.nextInt();
            int year1 = sc.nextInt();
            int day2 = sc.nextInt();
            int month2 = sc.nextInt();
            int year2 = sc.nextInt();

            LocalDate lc1 = LocalDate.of(year1, month1, day1);
            LocalDate lc2 = LocalDate.of(year2, month2, day2);
            Period per = Period.between(lc1, lc2);
            System.out.println("Case #" + (i + 1) + ":");
            System.out.println("Difference between " + day1 
                    + "/" + month1 + "/" + year1 + " and " 
                    + day2 + "/" + month2 + "/" + year2 + ": "
                    + Math.abs(per.getYears()) 
                    + " Year(s), " + Math.abs(per.getMonths()) 
                    + " Month(s), " + Math.abs(per.getDays()) 
                    + " Day(s)");

        }

    }
}
