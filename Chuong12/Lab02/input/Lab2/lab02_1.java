/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lesson12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab02_1 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        LocalDate lcDate1;
        LocalDate lcDate2;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int t, T = sc.nextInt();
        for (t=1; t<=T; t++)
        {
            int d, m, y;
            d = sc.nextInt();
            m = sc.nextInt();
            y = sc.nextInt();
            lcDate1 = LocalDate.of(y, m, d);
            d = sc.nextInt();
            m = sc.nextInt();
            y = sc.nextInt();
            lcDate2 = LocalDate.of(y, m, d);
            Period diff = Period.between(lcDate1, lcDate2);
            System.out.println("Case #"+t+':');
            System.out.printf("Difference between %02d/%02d/%04d and %02d/%02d/%04d:\n",
                        lcDate1.getDayOfMonth(), lcDate1.getMonthValue(), lcDate1.getYear(),
                        lcDate2.getDayOfMonth(), lcDate2.getMonthValue(), lcDate2.getYear());
            System.out.printf("%d Year(s), %d Month(s), %d Day(s)\n", Math.abs(diff.getYears()), Math.abs(diff.getMonths()), Math.abs(diff.getDays()));
        }
    }
    
}
