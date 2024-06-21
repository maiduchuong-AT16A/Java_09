/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

/**
 *
 * @author quanm
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i = 1; i <= t; i++){
           int day1 = sc.nextInt(), month1 = sc.nextInt(), year1 = sc.nextInt(), hour1 = sc.nextInt(), minute1 = sc.nextInt(), second1 = sc.nextInt();
           int day2 = sc.nextInt(), month2 = sc.nextInt(), year2 = sc.nextInt(), hour2 = sc.nextInt(), minute2 = sc.nextInt(), second2 = sc.nextInt();
           LocalDateTime date1 = LocalDateTime.of(year1, month1, day1, hour1, minute1, second1);
           LocalDateTime date2 = LocalDateTime.of(year2, month2, day2, hour2, minute2, second2);
           System.out.printf("Difference between (%02d/%02d/%04d %02d:%02d:%02d) and (%02d/%02d/%04d %02d:%02d:%02d):\n", date1.getDayOfMonth(), date1.getMonthValue(), date1.getYear(), date1.getHour(), date1.getMinute(), date1.getSecond(), date2.getDayOfMonth(), date2.getMonthValue(), date2.getYear(), date2.getHour(), date2.getMinute(), date2.getSecond());
           Duration duration = Duration.between(date1, date2);
           System.out.printf("%d Days, %d Hours, %d Minutes, %d Seconds\n", duration.toDaysPart(), duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart());    
       }
    }
}
