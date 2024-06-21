/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.doankhoahoc.lesson12.lab02;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int day1 = sc.nextInt();
            int month1 = sc.nextInt();
            int year1 = sc.nextInt();
            LocalDate firstDay = LocalDate.of(year1, month1, day1);

            int day2 = sc.nextInt();
            int month2 = sc.nextInt();
            int year2 = sc.nextInt();
            LocalDate secondDay = LocalDate.of(year2, month2, day2);

            Period kc = Period.between(firstDay, secondDay);

            System.out.println("Case #" + t + ":");
            System.out.printf("Difference between %02d/%02d/%04d and %02d/%02d/%04d: \n%d Year(s), %d Month(s), %d Day(s)\n", day1, month1, year1, day2, month2, year2, Math.abs(kc.getYears()), Math.abs(kc.getMonths()), Math.abs(kc.getDays()));
        }
    }
}
