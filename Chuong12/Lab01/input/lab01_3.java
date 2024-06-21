/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class lab01_3 {

    static Scanner sc = new Scanner(System.in);
    
    static void inRa(Calendar date, DateFormat df)
    {
        System.out.println(df.format(date.getTime()));
        date.add(Calendar.DAY_OF_MONTH, -1);
        System.out.println(df.format(date.getTime()));
        date.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(df.format(date.getTime()));
        date.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println(df.format(date.getTime()));
        date.roll(Calendar.DAY_OF_MONTH, false);
        System.out.println(df.format(date.getTime()));

    }
    
    public static void main(String[] args) {
        Calendar Date = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        int t, T = sc.nextInt();
        for (t=1; t<=T; t++)
        {
            int d, m, y;
            d = sc.nextInt();
            m = sc.nextInt();
            y = sc.nextInt();
            Date.set(y, m-1, d);
            System.out.println("Case #"+t+":");
            inRa(Date, df);
        }
        
    }
    
}
