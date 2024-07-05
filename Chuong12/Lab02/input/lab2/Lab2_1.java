/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javacore.basic.lesson12.lab2_1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab2_1 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        
        int t = SC.nextInt();
        
        for(int i = 0;i < t;i++){
            int day1 = SC.nextInt();
            int month1 = SC.nextInt();
            int year1 = SC.nextInt();
            
            int day2 = SC.nextInt();
            int month2 = SC.nextInt();
            int year2 = SC.nextInt();
            
            LocalDate date1 = LocalDate.of(year1,month1,day1);
            LocalDate date2 = LocalDate.of(year2,month2,day2);
            
             Period cl;
            if (date1.isAfter(date2)) {
                cl = Period.between(date2, date1);
                System.out.println("Case #" + i + ":");
                System.out.println("Difference between " + day1 + "/" + month1 + "/" + year1 + " and " + day2 + "/" + month2 + "/" + year2 + ":");
                System.out.println(cl.getYears() + " Year(s), " + cl.getMonths() + " Month(s), " + cl.getDays() + " Day(s)");
            } else {
                cl = Period.between(date1, date2);
                System.out.println("Case #" + i + ":");
                System.out.println("Difference between " + day2 + "/" + month2 + "/" + year2 + " and " + day1 + "/" + month1 + "/" + year1 + ":");
                System.out.println(cl.getYears() + " Year(s), " + cl.getMonths() + " Month(s), " + cl.getDays() + " Day(s)");
            }
        }
        }
                
    }


