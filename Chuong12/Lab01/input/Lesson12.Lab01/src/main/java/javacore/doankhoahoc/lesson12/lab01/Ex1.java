/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.doankhoahoc.lesson12.lab01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *
 * @author Admin
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            Calendar date = Calendar.getInstance();
            date.set(year, month - 1, day);
            
            SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
            sdf.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));

            System.out.println("Case #" + (t + 1) + ":");
            System.out.println(sdf.format(date.getTime()));
        }
    }
}
