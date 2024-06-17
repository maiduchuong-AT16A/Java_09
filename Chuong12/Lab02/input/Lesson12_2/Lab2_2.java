
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Lab2_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int dayOfMonth1 = sc.nextInt();
            int month1 = sc.nextInt();
            int year1 = sc.nextInt();
            int hour1 = sc.nextInt();
            int minute1 = sc.nextInt();
            int second1 = sc.nextInt();
            int dayOfMonth2 = sc.nextInt();
            int month2 = sc.nextInt();
            int year2 = sc.nextInt();
            int hour2 = sc.nextInt();
            int minute2 = sc.nextInt();
            int second2 = sc.nextInt();
            System.out.printf("Case #%d:\n", i + 1);
            System.out.printf("Difference between (%02d/%02d/%04d %02d:%02d:%02d) and (%02d/%02d/%04d %02d:%02d:%02d):\n",
                    dayOfMonth1, month1, year1, hour1, minute1, second1,
                    dayOfMonth2, month2, year2, hour2, minute2, second2);
            LocalDateTime date1 = LocalDateTime.of(year1, month1, dayOfMonth1, hour1, minute1, second1);

            LocalDateTime date2 = LocalDateTime.of(year2, month2, dayOfMonth2, hour2, minute2, second2);
            Duration duration = Duration.between(date1, date2);
            System.out.printf("%d Days, %d Hours, %d Minutes, %d Seconds",
                    Math.abs(duration.toDaysPart()), Math.abs(duration.toHoursPart()), Math.abs(duration.toMinutesPart()), Math.abs(duration.toSecondsPart()));
            System.out.println();

        }
    }
}
