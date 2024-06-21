/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author quanm
 */
import static java.lang.Math.abs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
import java.util.Calendar;
public class Lab02_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    for(int i = 1; i <= t; i++){
        int day1 = sc.nextInt(), month1 = sc.nextInt(), year1 = sc.nextInt();
        int day2 = sc.nextInt(), month2 = sc.nextInt(), year2 = sc.nextInt();
        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);
        System.out.println("Case #" + i + ":");
        System.out.printf("Difference between %02d/%02d/%d and %02d/%02d/%d:\n", date1.getDayOfMonth(), date1.getMonthValue(), date1.getYear(), date2.getDayOfMonth(), date2.getMonthValue(), date2.getYear());
        Period period = Period.between(date1, date2);
        System.out.println(abs(period.getYears()) + " Year(s), " + abs(period.getMonths()) + " Month(s), " + abs(period.getDays()) + " Days(s)");
    }
    }
}
