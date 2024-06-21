/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lesson12_lab1_1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson12_lab1_1 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            Calendar date = Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            date.set(Calendar.MONTH, sc.nextInt() - 1);
            date.set(Calendar.YEAR, sc.nextInt());
            date.set(Calendar.HOUR, 0);
            date.set(Calendar.MINUTE, 0);
            date.set(Calendar.SECOND, 0);
            System.out.println("Case #"+(i+1)+":");
            System.out.println(date.getTime());
        }
    }
}
