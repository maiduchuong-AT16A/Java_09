/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;

/**
 *
 * @author quanm
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class Lab01_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            Calendar Date = Calendar.getInstance();
            
            System.out.println("Case #" + i + ":");
            DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
            int date = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
            
            
            int currMonth = Date.get(Calendar.MONTH) + 1;
            Date.add(Calendar.MONTH, month - currMonth);
            Date.set(Calendar.YEAR, year);
            Date.set(Calendar.DAY_OF_MONTH, date);
            String str = df.format(Date.getTime());
            System.out.println(str);
            if(Date.get(Calendar.DAY_OF_WEEK) != 1){
                Date.set(Calendar.DAY_OF_WEEK, 2);
                str = df.format(Date.getTime());
                System.out.println(str);
                Date.add(Calendar.DAY_OF_MONTH, 7 - Date.get(Calendar.DAY_OF_WEEK) + 1);
                str = df.format(Date.getTime());
                System.out.println(str);
            }
            else{
                Date.set(Calendar.DAY_OF_WEEK, 2);
                str = df.format(Date.getTime());
                System.out.println(str);
                Date.add(Calendar.DAY_OF_MONTH, 6);
                str = df.format(Date.getTime());
                System.out.println(str);
            }
        }
    }
}
