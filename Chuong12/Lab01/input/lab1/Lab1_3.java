/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author tuan anh
 */
public class Lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            Calendar date = Calendar.getInstance();
            int ngay = sc.nextInt();
            int thang = sc.nextInt();
            int nam = sc.nextInt();
            System.out.printf("Case #%d\n", t + 1);
            date.set(nam, thang - 1, ngay, 0, 0, 0);
            DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
            System.out.println(df.format(date.getTime()));
            date.add(Calendar.DAY_OF_YEAR, -1);
            System.out.println(df.format(date.getTime()));
            date.add(Calendar.DAY_OF_YEAR,2);
            System.out.println(df.format(date.getTime()));
            while(true)
            {
                if(date.get(Calendar.DAY_OF_MONTH)==1){
                    System.out.println(df.format(date.getTime()));
                    break;
                }
                date.roll(Calendar.DAY_OF_MONTH, false);
            }
            
                date.add(Calendar.MONTH, 1);
                date.add(Calendar.DAY_OF_YEAR, -1);
                System.out.println(df.format(date.getTime()));
        }
    }
}
