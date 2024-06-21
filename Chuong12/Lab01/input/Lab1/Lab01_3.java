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

public class Lab01_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            Calendar Date = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
            int date = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
            int currMonth = Date.get(Calendar.MONTH) + 1;
            Date.add(Calendar.MONTH, month - currMonth);
            Date.set(Calendar.YEAR, year);
            Date.set(Calendar.DAY_OF_MONTH, date);
            String str = df.format(Date.getTime());
            Calendar Date2 = Date;
            System.out.println("Case #" + i + ":");
            System.out.println(str);
            Date.add(Calendar.DAY_OF_MONTH, -1);
            str = df.format(Date.getTime());
            System.out.println(str);
            Date.add(Calendar.DAY_OF_MONTH, 2);
            str = df.format(Date.getTime());
            System.out.println(str);
            Date.add(Calendar.DAY_OF_MONTH, -1);
            Date.set(Calendar.DAY_OF_MONTH, 1);
            str = df.format(Date.getTime());
            System.out.println(str);
            switch (Date2.get(Calendar.MONTH) + 1) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    Date.set(Calendar.DAY_OF_MONTH, 31);
                    str = df.format(Date.getTime());
                    System.out.println(str);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    Date.set(Calendar.DAY_OF_MONTH, 30);
                    str = df.format(Date.getTime());
                    System.out.println(str);
                    break;
                case 2:
                    if ((Date2.get(Calendar.YEAR) % 4 == 0 && Date2.get(Calendar.YEAR) % 100 != 0) || Date2.get(Calendar.YEAR) % 400 == 0) {
                        Date.set(Calendar.DAY_OF_MONTH, 29);
                        str = df.format(Date.getTime());
                        System.out.println(str);
                    } else {
                        Date.set(Calendar.DAY_OF_MONTH, 28);
                        str = df.format(Date.getTime());
                        System.out.println(str);
                    }
            }
        }
    }
}

