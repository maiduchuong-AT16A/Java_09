
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Lab1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("EEE dd-MM-yyyy");
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            Calendar date = Calendar.getInstance();
            date.set(Calendar.DAY_OF_MONTH, sc.nextInt());
            date.set(Calendar.MONTH, sc.nextInt() - 1);
            date.set(Calendar.YEAR, sc.nextInt());
            System.out.println("Case #"+(i+1)+":");
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DAY_OF_WEEK, 2);
            System.out.println(df.format(date.getTime()));
            date.set(Calendar.DAY_OF_WEEK, 1);
            date.add(Calendar.DAY_OF_MONTH, 7);
            System.out.println(df.format(date.getTime()));
        }
        
    }
}
