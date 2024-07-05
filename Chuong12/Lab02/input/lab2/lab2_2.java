/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson12.lab2_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class lab2_2 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int t = SC.nextInt();
        for (int i = 0; i < t; i++) {
            
            int day1 = SC.nextInt();
            int month1 = SC.nextInt();
            int year1 = SC.nextInt();
            int hour1 = SC.nextInt();
            int minute1 = SC.nextInt();
            int second1 = SC.nextInt();
            
            int day2 = SC.nextInt();
            int month2 = SC.nextInt();
            int year2 = SC.nextInt();
            int hour2 = SC.nextInt();
            int minute2 = SC.nextInt();
            int second2 = SC.nextInt();
            
            LocalDateTime dt1 = LocalDateTime.of(year1, month1, day1, hour1, minute1, second1);
            LocalDateTime dt2 = LocalDateTime.of(year2, month2, day2, hour2, minute2, second2);
            
            Duration duration = Duration.between(dt1, dt2);
            
            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;
            long seconds = duration.getSeconds() % 60;
            
            System.out.printf("Case #%d:\n",i + 1);
            System.out.println("Difference between (" + day1 + "/" + month1 + "/" + year1 + " " + hour1 + ":" + minute1 + ":" + second1 + ") and (" + day2 + "/" + month2 + "/" + year2 + " " + hour2 + ":" + minute2 + ":" + second2 + "):");
            System.out.println(days + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds");
            

        }

    }
}
