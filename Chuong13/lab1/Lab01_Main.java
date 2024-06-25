/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab01_Main {

    static Scanner sc = new Scanner(System.in);
    static LinkedList<Integer> dsach = new LinkedList<>();
    
    static void func01()
    {
        char kiTu = sc.next().charAt(0);
        switch (kiTu) {
            case 'F' -> dsach.add(0, sc.nextInt());
            case 'L' -> dsach.add(dsach.size(), sc.nextInt());
            default -> {
                int x,y;
                y = sc.nextInt();
                x = sc.nextInt();
                dsach.add(y, x);
            }
        }
    }
    
    static void func02()
    {
        int count=0, x = sc.nextInt();
        for (int i=0; i<dsach.size(); i++)
        {
            if (dsach.get(i)==x)
            {
                dsach.remove(i);
                count++;
            }
        }
        System.out.println(count);
    }
    
    static void func03()
    {
        int count=0, x = sc.nextInt();
        for (int i=0; i<dsach.size(); i++)
        {
            if (dsach.get(i)==x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    
    static void func04()
    {
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        for (int i=x; i<=y; i++)
            System.out.print(dsach.get(i)+" ");
        System.out.println("");
    }
    
    static void func05()
    {
        for (int i=0; i<dsach.size(); i++)
            System.out.printf(dsach.get(i)+" ");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int n, N = sc.nextInt();
        for (n=1; n<=N; n++)
        {
            short choice = sc.nextShort();
            switch (choice)
            {
                case 1:
                    func01();
                    break;
                case 2:
                    func02();
                    break;
                case 3:
                    func03();
                    break;
                case 4:
                    func04();
                    break;
                case 5:
                    func05();
                    break;
            }
        }
    }
    
}
