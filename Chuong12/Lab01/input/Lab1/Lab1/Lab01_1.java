/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author quanm
 */

public class Lab01_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            Calendar Date = Calendar.getInstance();
            int date = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
            int currMonth = Date.get(Calendar.MONTH) + 1;
            int add = month - currMonth;
            System.out.println(add);
            Date.add(Calendar.MONTH, add);
            Date.set(Calendar.YEAR, year);
            Date.set(Calendar.DAY_OF_MONTH, date);
            Date.set(Calendar.HOUR_OF_DAY, 0);
            Date.set(Calendar.MINUTE, 0);
            Date.set(Calendar.SECOND, 0);
            System.out.println("Case #" + i + ":");
            System.out.println(Date.getTime());
        }
    }
}
