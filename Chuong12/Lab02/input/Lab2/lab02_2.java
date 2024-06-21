/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lesson12;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab02_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime ldTime1, ldTime2;
        int t, T = sc.nextInt();
        for (t=1; t<=T; t++)
        {
            int d,M,y,hr,min,sec;
            d = sc.nextInt(); M = sc.nextInt(); y = sc.nextInt();
            hr= sc.nextInt(); min = sc.nextInt(); sec=sc.nextInt();
            ldTime1 = LocalDateTime.of(y, M, d, hr, min, sec);
            
            d = sc.nextInt(); M = sc.nextInt(); y = sc.nextInt();
            hr= sc.nextInt(); min = sc.nextInt(); sec=sc.nextInt();
            ldTime2 = LocalDateTime.of(y, M, d, hr, min, sec);
            
            Duration dif = Duration.between(ldTime1, ldTime2);
            
            System.out.println("Case #"+t+":");
            System.out.printf("Difference between (%02d/%02d/%04d %02d:%02d:%02d) and (%02d/%02d/%04d %02d:%02d:%02d):\n",
                              ldTime1.getDayOfMonth(), ldTime1.getMonthValue(), ldTime1.getYear(),
                              ldTime1.getHour(), ldTime1.getMinute(), ldTime1.getSecond(),
                              ldTime2.getDayOfMonth(), ldTime2.getMonthValue(), ldTime2.getYear(),
                              ldTime2.getHour(), ldTime2.getMinute(), ldTime2.getSecond());
            
            System.out.printf("%d Days, %d Hours, %d Minutes, %d Seconds\n",dif.toDaysPart(), dif.toHoursPart(), dif.toMinutesPart(), dif.toSecondsPart());
        }
    }
    
}
