/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.doankhoahoc.lesson12.lab01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            Calendar date = Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            date.set(Calendar.MONTH, sc.nextInt() - 1);
            date.set(Calendar.YEAR, sc.nextInt());

            SimpleDateFormat sdf = new SimpleDateFormat("EEE dd-MM-yyyy");

            System.out.println("Case #" + (t + 1) + ":");
            System.out.println(sdf.format(date.getTime()));
            Calendar first = (Calendar) date.clone();
            first.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            System.out.println(sdf.format(first.getTime()));
            Calendar end = (Calendar) date.clone();
            end.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
            end.add(Calendar.DAY_OF_WEEK, 7);
            System.out.println(sdf.format(end.getTime()));
        }
    }
}
